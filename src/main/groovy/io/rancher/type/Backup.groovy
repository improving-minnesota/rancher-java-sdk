package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Backup extends RancherType { 
  String accountId
  String backupTargetId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String removeTime
  String removed
  String snapshotId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uri
  String uuid
  String volumeId
}
