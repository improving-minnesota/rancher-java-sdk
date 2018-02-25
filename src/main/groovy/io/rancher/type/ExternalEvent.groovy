package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalEvent extends RancherType { 
  String accountId
  String created
  String eventType
  String externalId
  String kind
  String reportedAccountId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
