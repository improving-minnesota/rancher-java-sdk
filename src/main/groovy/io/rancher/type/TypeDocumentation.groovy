package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class TypeDocumentation implements RancherType {
  String description
  Map<String, Object> resourceFields
}
