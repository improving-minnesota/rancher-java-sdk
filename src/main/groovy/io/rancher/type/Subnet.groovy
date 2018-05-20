package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Subnet implements RancherType {
  String accountId
  BigInteger cidrSize
  String created
  Map<String, Object> data
  String description
  String endAddress
  String gateway
  String kind
  String name
  String networkAddress
  String networkId
  String removeTime
  String removed
  String startAddress
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
