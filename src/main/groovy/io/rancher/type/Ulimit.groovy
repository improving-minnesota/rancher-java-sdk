package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Ulimit extends RancherType { 
  BigInteger hard
  String name
  BigInteger soft
}
