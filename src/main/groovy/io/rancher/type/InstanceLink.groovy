package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class InstanceLink extends RancherType { 
  String accountId
  String created
  String description
  String instanceId
  String kind
  String linkName
  String name
  String removed
  String state
  String targetInstanceId
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
