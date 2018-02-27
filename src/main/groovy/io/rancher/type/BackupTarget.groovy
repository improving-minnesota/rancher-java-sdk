package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class BackupTarget extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  NfsConfig nfsConfig
  String removeTime
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
