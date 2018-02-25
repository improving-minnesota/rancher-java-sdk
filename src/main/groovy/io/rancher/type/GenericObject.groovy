package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class GenericObject extends RancherType { 
  String accountId
  String created
  String description
  String key
  String kind
  String name
  String removed
  Map<String, Object> resourceData
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
