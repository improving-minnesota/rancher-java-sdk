package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Snapshot implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String removeTime
  String removed
  String state
  String uuid
  String volumeId
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
