package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class StorageDriver extends RancherType { 
  String accountId
  String blockDevicePath
  String created
  String description
  String kind
  String name
  String removed
  String scope
  String serviceId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String volumeAccessMode
  List<String> volumeCapabilities
}
