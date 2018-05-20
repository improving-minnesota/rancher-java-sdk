package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceLog implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String endTime
  String eventType
  String instanceId
  String kind
  String level
  String serviceId
  Boolean subLog
  String transactionId
}
