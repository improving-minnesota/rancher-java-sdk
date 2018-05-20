package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class MountEntry implements RancherType {
  String instanceId
  String instanceName
  String path
  String volumeId
  String volumeName
}
