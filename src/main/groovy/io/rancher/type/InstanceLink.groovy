package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class InstanceLink implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String instanceId
  String kind
  String linkName
  String name
  String removeTime
  String removed
  String state
  String targetInstanceId
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  List<Map<String, Object>> ports
}
