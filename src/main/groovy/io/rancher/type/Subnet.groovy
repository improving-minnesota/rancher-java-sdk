package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Subnet extends RancherType { 
  String accountId
  BigInteger cidrSize
  String created
  String description
  String endAddress
  String gateway
  String kind
  String name
  String networkAddress
  String networkId
  String removed
  String startAddress
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
