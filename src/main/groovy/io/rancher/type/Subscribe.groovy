package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Subscribe extends RancherType { 
  List<String> eventNames
}
