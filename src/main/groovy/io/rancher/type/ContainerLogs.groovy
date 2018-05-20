package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ContainerLogs implements RancherType {
  Boolean follow
  BigInteger lines
}
