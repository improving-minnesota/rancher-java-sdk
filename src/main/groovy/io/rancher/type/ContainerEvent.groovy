package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ContainerEvent extends RancherType { 
  String accountId
  String created
  Map<String, Object> dockerInspect
  String externalFrom
  String externalId
  String externalStatus
  BigInteger externalTimestamp
  String hostId
  String kind
  String reportedHostUuid
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
