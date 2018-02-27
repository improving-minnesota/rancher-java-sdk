package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Account extends RancherType { 
  String created
  Map<String, Object> data
  String description
  String externalId
  String externalIdType
  String identity
  String kind
  String name
  String removeTime
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String version
}
