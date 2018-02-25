package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceEvent extends RancherType { 
  String accountId
  String created
  String description
  BigInteger externalTimestamp
  String healthcheckUuid
  String hostId
  String instanceId
  String kind
  String name
  String removed
  String reportedHealth
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
