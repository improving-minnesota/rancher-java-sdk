package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class HostTemplate implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String driver
  String flavorPrefix
  String kind
  String name
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  Map<String, Object> secretValues
  Map<String, Object> publicValues
}
