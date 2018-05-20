package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class AddOutputsInput implements RancherType {
  Map<String, Object> outputs
}
