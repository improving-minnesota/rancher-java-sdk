package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ContainerProxy extends RancherType { 
  BigInteger port
  String scheme
}
