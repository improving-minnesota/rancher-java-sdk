package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalHostEvent extends RancherType { 
  String accountId
  String created
  Boolean deleteHost
  String eventType
  String externalId
  String hostId
  String hostLabel
  String kind
  String reportedAccountId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
