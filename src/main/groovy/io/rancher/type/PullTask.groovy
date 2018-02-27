package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class PullTask extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String description
  String image
  String kind
  Map<String, Object> labels
  String mode
  String name
  String removeTime
  String removed
  String state
  Map<String, Object> status
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
