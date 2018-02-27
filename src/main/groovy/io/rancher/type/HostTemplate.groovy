package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class HostTemplate extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String description
  String driver
  String flavorPrefix
  String kind
  String name
  Map<String, Object> publicValues
  String removeTime
  String removed
  Map<String, Object> secretValues
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
