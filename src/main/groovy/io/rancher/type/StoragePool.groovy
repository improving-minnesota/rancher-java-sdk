package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class StoragePool extends RancherType { 
  String accountId
  String blockDevicePath
  String created
  String description
  String driverName
  String externalId
  List<String> hostIds
  String kind
  String name
  String removed
  String state
  String storageDriverId
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String volumeAccessMode
  List<String> volumeCapabilities
  List<String> volumeIds
}
