package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class CatalogTemplate implements RancherType {
  Map<String, Object> answers
  Binding binding
  String description
  String dockerCompose
  String name
  String rancherCompose
  String templateId
  String templateVersionId
}
