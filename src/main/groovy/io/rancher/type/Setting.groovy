package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Setting extends RancherType { 
  String activeValue
  Boolean inDb
  String name
  String source
  String value
}
