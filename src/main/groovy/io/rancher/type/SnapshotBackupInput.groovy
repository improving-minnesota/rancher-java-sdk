package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class SnapshotBackupInput extends RancherType { 
  String backupTargetId
  Map<String, Object> data
  String name
  String removeTime
}
