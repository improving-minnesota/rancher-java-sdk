package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExtensionImplementation extends RancherType { 
  String className
  String name
  Map<String, Object> properties
}
