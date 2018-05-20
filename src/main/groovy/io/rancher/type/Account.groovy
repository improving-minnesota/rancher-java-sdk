package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Account implements RancherType {
  String created
  Map<String, Object> data
  String description
  String externalId
  String externalIdType
  String kind
  String name
  String removeTime
  String removed
  String state
  String uuid
  String version
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String identity
}
