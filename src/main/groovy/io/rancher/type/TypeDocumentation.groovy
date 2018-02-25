package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class TypeDocumentation extends RancherType { 
  String description
  Map<String, Object> resourceFields
}
