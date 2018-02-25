package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class HealthcheckInstanceHostMap extends RancherType { 
  String accountId
  String created
  String description
  String healthState
  String hostId
  String instanceId
  String kind
  String name
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
