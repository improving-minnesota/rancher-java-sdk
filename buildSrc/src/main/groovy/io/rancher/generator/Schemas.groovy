package io.rancher.generator

class Schemas {
  List<Schema> data
}

class Schema {
  String id, pluralName
  Map<String, Field> resourceFields
  Map<String, Action> resourceActions
  Set<String> resourceMethods, collectionMethods

  static MethodGet = 'GET'
  static MethodPost = 'POST'
  static MethodPut = 'PUT'
  static MethodDelete = 'DELETE'

  String getTypeClass() { id.capitalize() }
  boolean isCollectionGet() { collectionMethods?.contains MethodGet }
  boolean isCollectionPost() { collectionMethods?.contains MethodPost }
  boolean isResourceGet() { resourceMethods?.contains MethodGet }
  boolean isResourcePut() { resourceMethods?.contains MethodPut }
  boolean isResourceDelete() { resourceMethods?.contains MethodDelete }

  Map<String, Action> getResourceActions() {
    resourceActions.findAll {
      !['create', 'update'].contains(it.key) && it.value.outputClass
    }
  }

  Set<String> getActionImports() {
    resourceActions.collectMany { action, config ->
      def imports = []
      if (config.input && config.input.capitalize() != typeClass) {
        imports << "io.rancher.type.${config.input.capitalize()}".toString()
      }
      if (config.output && config.output.capitalize() != typeClass) {
        imports << "io.rancher.type.${config.output.capitalize()}".toString()
      }
      imports
    } as Set
  }
}

class Field {
  String type
  String getTypeClass() { type.capitalize() }
}

class Action {
  String input, output

  String getInputClass() { input?.capitalize() }
  String getOutputClass() { output?.capitalize() }
}
