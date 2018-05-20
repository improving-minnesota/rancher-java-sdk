package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class IpAddress implements RancherType {
  String accountId
  String address
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String networkId
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
