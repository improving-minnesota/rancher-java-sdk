package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class AddOutputsInput extends RancherType { 
  Map<String, Object> outputs
}
