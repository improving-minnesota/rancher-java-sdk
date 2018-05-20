package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class VolumeSnapshotInput implements RancherType {
  String name
}
