package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class HaConfig implements RancherType {
  BigInteger clusterSize
  BigInteger dbSize
  Boolean enabled
  String dbHost
}
