package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class IpAddress extends RancherType { 
  String accountId
  String address
  String created
  String description
  String kind
  String name
  String networkId
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
