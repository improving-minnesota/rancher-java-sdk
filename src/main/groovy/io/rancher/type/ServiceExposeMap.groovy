package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceExposeMap implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String instanceId
  String ipAddress
  String kind
  Boolean managed
  String name
  String removeTime
  String removed
  String serviceId
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
