package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class StoragePool implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String driverName
  String externalId
  String kind
  String name
  String removeTime
  String removed
  String state
  String storageDriverId
  String uuid
  String volumeAccessMode
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  List<String> hostIds
  String blockDevicePath
  List<String> volumeCapabilities
  List<String> volumeIds
}
