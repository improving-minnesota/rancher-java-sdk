package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalStoragePoolEvent extends RancherType { 
  String accountId
  String created
  String eventType
  String externalId
  List<String> hostUuids
  String kind
  String reportedAccountId
  String state
  StoragePool storagePool
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
