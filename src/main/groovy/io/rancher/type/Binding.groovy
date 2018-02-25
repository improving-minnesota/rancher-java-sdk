package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Binding extends RancherType { 
  Map<String, Object> services
}
