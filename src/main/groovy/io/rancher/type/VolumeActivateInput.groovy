package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class VolumeActivateInput implements RancherType {
  String hostId
}
