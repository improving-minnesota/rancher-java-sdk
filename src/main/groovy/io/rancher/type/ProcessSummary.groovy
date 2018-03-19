package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProcessSummary implements RancherType {
  BigInteger delay
  String processName
  BigInteger ready
  BigInteger running
}
