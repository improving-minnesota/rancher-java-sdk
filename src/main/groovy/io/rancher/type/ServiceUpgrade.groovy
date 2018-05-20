package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceUpgrade implements RancherType {
  InServiceUpgradeStrategy inServiceStrategy
  ToServiceUpgradeStrategy toServiceStrategy
}
