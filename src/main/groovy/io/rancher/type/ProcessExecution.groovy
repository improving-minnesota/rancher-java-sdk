package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProcessExecution implements RancherType {
  String created
  Map<String, Object> log
  String processInstanceId
  String uuid
}
