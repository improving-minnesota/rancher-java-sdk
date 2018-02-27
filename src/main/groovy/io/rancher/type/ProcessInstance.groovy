package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProcessInstance extends RancherType { 
  String accountId
  Map<String, Object> data
  String endTime
  BigInteger executionCount
  String exitReason
  String phase
  BigInteger priority
  String processName
  String resourceId
  String resourceType
  String result
  String runAfter
  String runningProcessServerId
  String startProcessServerId
  String startTime
}
