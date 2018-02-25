package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceExposeMap extends RancherType { 
  String accountId
  String created
  String description
  String instanceId
  String ipAddress
  String kind
  Boolean managed
  String name
  String removed
  String serviceId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
