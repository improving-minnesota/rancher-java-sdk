package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Mount extends RancherType { 
  String accountId
  String created
  String description
  String instanceId
  String kind
  String name
  String path
  String permissions
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String volumeId
}