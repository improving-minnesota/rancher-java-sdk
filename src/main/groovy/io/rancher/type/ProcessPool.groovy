package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProcessPool implements RancherType {
  BigInteger activeTasks
  BigInteger completedTasks
  BigInteger maxPoolSize
  BigInteger minPoolSize
  String name
  BigInteger poolSize
  BigInteger queueRemainingCapacity
  BigInteger queueSize
  BigInteger rejectedTasks
}
