package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServicesPortRange implements RancherType {
  BigInteger endPort
  BigInteger startPort
}
