package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ToServiceUpgradeStrategy implements RancherType {
  BigInteger batchSize
  BigInteger finalScale
  BigInteger intervalMillis
  String toServiceId
  Boolean updateLinks
}
