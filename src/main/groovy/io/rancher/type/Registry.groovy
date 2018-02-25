package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Registry extends RancherType { 
  String accountId
  String blockDevicePath
  String created
  String description
  String driverName
  String externalId
  String kind
  String name
  String removed
  String serverAddress
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String volumeAccessMode
  List<String> volumeCapabilities
}