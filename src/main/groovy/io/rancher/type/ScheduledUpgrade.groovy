package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ScheduledUpgrade extends RancherType { 
  String accountId
  String created
  String kind
  String removed
  String stackId
  String started
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
