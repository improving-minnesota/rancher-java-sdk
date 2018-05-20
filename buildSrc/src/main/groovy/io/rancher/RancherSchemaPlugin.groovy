package io.rancher

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import io.rancher.generator.Schema
import io.rancher.generator.Schemas
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskAction
import org.stringtemplate.v4.ST

class RancherSchemaPlugin implements Plugin<Project> {
  @Override
  void apply(Project project) {
    def extension = project.extensions.create ('rancher', RancherPluginExtension, project)
    project.tasks.create('rancherClean', RancherClean) {
      basePackage = extension.basePackage
      baseSchema = extension.baseSchema
      projectSchema = extension.projectSchema
    }
  }
}

class RancherPluginExtension {
  final Property<String> basePackage
  final Property<File> baseSchema, projectSchema

  RancherPluginExtension(Project project) {
    basePackage = project.objects.property(String)
    basePackage.set('io.rancher')

    baseSchema = project.objects.property(File)
    baseSchema.set(new File("${project.projectDir.path}/src/main/resources/schemas.json"))

    projectSchema = project.objects.property(File)
    projectSchema.set(new File("${project.projectDir.path}/src/main/resources/projectSchema.json"))
  }
}

class RancherClean extends DefaultTask {
  final ObjectMapper om = new ObjectMapper().with {
    disable DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES
  }
  final outputDirectory = "${project.projectDir.path}/src/main/groovy/io/rancher"
  final blacklistTypes = ['schema', 'subscribe', 'resource', 'collection']
  final typeTemplate = new File("${project.projectDir.path}/buildSrc/src/main/resources/type.template")
  final serviceTemplate = new File("${project.projectDir.path}/buildSrc/src/main/resources/service.template")

  final Property<String> basePackage = project.objects.property(String)
  final Property<File> baseSchema = project.objects.property(File)
  final Property<File> projectSchema = project.objects.property(File)

  @TaskAction
  void cleanRancherSchema() {
    logger.quiet 'cleaning rancher services and types'

    def srcPackage = basePackage.get().replaceAll('\\.', '/')
    def typesDir = "${project.projectDir.path}/src/main/groovy/${srcPackage}/service"
    logger.quiet 'typesDir: {}', typesDir
    new File(typesDir).deleteDir()

    def servicesDir = "${project.projectDir.path}/src/main/groovy/${srcPackage}/type"
    logger.quiet 'servicesDir: {}', servicesDir
    new File(servicesDir).deleteDir()

    // setup schema types
    logger.quiet 'baseSchema: {}', baseSchema.get().path
    logger.quiet 'projectSchema: {}', projectSchema.get().path
    def schemas = om.readValue baseSchema.get(), Schemas
    def projectSchemas = om.readValue projectSchema.get(), Schemas
    def projectScheme = projectSchemas.data.findAll { !blacklistTypes.contains(it.id) }

    logger.quiet 'creating rancher types'
    processSchema(schemas.data)

    // setup schema services
    logger.quiet 'creating rancher services'
    schemas.data.each { typeSchema ->
      if (blacklistTypes.contains(typeSchema.id)) {
        return
      }

      def subResources = typeSchema.id == 'project' ? projectScheme : null
      def importTypes = subResources ?
        projectSchemas.data
          .findAll {
            def type = it.id
            def typeClass = type.capitalize()
            !blacklistTypes.contains(type) &&
              !typeSchema.actionImports.contains("io.rancher.type.${typeClass}".toString()) &&
              typeSchema.typeClass != typeClass
          }
          .collect { "io.rancher.type.${it.id.capitalize()}".toString() } :
          []

      def serviceTemplate = new ST(serviceTemplate.text).with {
        add 'schema', typeSchema
        add 'subResources', subResources
        add 'importTypes', importTypes
        render()
      }

      def serviceFile = new File("${outputDirectory}/service/${typeSchema.typeClass}Api.groovy", '')
      serviceFile.parentFile.mkdirs()
      serviceFile.text = serviceTemplate
    }
  }

  static Map<String, String> findTypes(Schema schema) {
    def resourceFields = schema.resourceFields
    resourceFields
      .findAll { it.key != 'id' }
      .collectEntries([:]) { name, field ->

      String type = field.type

      if (['reference', 'date', 'enum'].any { type.startsWith it }) {
        field.type = 'String'
      } else if (type.startsWith('array[reference[')) {
        field.type = 'List<String>'
      } else if (type.startsWith('array')) {
        switch (type) {
          case 'array[reference]':
          case 'array[date]':
          case 'array[enum]':
          case 'array[string]':
            field.type = 'List<String>'
            break
          case 'array[int]':
            field.type = 'List<BigInteger>'
            break
          case 'array[float64]':
            field.type = 'List<Float>'
            break
          case 'array[json]':
            field.type = 'List<Map<String, Object>>'
            break
          default:
            def listType = type[type.indexOf('[') + 1 .. type.lastIndexOf(']') - 1].capitalize()
            field.type = "List<${listType}>"
        }
      } else if (type.startsWith('map')) {
        field.type = 'Map<String, Object>'
      } else if (type.startsWith('json')) {
        field.type = 'Map<String, Object>'
      } else if (type.startsWith('boolean')) {
        field.type = 'Boolean'
      } else if (type.startsWith('float')) {
        field.type = 'Float'
      } else if (type.startsWith('int')) {
        field.type = 'BigInteger'
      } else {
        field.type = type.capitalize()
      }

      [name, field.type]
    }
  }

  def processSchema(List<Schema> schemas) {
    schemas.each { typeSchema ->
      if (blacklistTypes.contains(typeSchema.id)) {
        return
      }

      def types = findTypes typeSchema
      def typeClass = typeSchema.typeClass

      def typedTemplate = new ST(typeTemplate.text).with {
        add 'typeClass', typeClass
        add 'fields', types
        render()
      }

      def typeFile = new File("${outputDirectory}/type/${typeClass}.groovy", '')
      typeFile.parentFile.mkdirs()
      typeFile.text = typedTemplate
    }
  }
}