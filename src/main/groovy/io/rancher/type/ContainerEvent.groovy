package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ContainerEvent implements RancherType {
  String accountId
  String created
  Map<String, Object> data
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
  Map<String, Object> dockerInspect
}
