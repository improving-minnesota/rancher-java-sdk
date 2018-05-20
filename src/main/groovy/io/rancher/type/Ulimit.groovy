package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Ulimit implements RancherType {
  BigInteger hard
  String name
  BigInteger soft
}
