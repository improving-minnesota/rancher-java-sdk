package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class InServiceUpgradeStrategy implements RancherType {
  BigInteger batchSize
  BigInteger intervalMillis
  LaunchConfig launchConfig
  LaunchConfig previousLaunchConfig
  List<SecondaryLaunchConfig> previousSecondaryLaunchConfigs
  List<SecondaryLaunchConfig> secondaryLaunchConfigs
  Boolean startFirst
}
