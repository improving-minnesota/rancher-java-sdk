package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Binding implements RancherType {
  Map<String, Object> services
}
