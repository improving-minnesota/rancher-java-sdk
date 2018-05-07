package io.rancher

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskAction

class SchemaProcessorPlugin implements Plugin<Project> {
  @Override
  void apply(Project project) {
    def extension = project.extensions.create ('rancher', RancherPluginExtension, project)
    project.tasks.create('rancherClean', RancherClean) {
      basePackage = extension.basePackage
    }
  }
}

class RancherPluginExtension {
  final Property<String> basePackage

  RancherPluginExtension(Project project) {
    basePackage = project.objects.property(String)
    basePackage.set('io.rancher')
  }
}

class RancherClean extends DefaultTask {
  final Property<String> basePackage = project.objects.property(String)

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
  }
}