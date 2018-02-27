package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExtensionPoint extends RancherType { 
  String excludeSetting
  List<ExtensionImplementation> implementations
  String includeSetting
  String listSetting
  String name
}
