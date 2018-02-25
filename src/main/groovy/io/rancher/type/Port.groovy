package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Port extends RancherType { 
  String accountId
  String bindAddress
  String created
  String description
  String instanceId
  String kind
  String name
  String privateIpAddressId
  BigInteger privatePort
  String protocol
  String publicIpAddressId
  BigInteger publicPort
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
