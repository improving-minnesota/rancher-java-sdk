package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Port implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String instanceId
  String kind
  String name
  String privateIpAddressId
  BigInteger privatePort
  String protocol
  String publicIpAddressId
  BigInteger publicPort
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String bindAddress
}
