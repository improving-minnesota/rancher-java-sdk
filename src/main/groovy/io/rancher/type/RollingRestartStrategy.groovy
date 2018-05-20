package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class RollingRestartStrategy implements RancherType {
  BigInteger batchSize
  BigInteger intervalMillis
}
