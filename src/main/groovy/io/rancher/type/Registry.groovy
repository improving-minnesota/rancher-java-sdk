package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Registry implements RancherType {
  String accountId
  String blockDevicePath
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
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String volumeAccessMode
  List<String> volumeCapabilities
  String serverAddress
}
