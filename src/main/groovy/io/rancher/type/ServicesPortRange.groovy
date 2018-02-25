package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServicesPortRange extends RancherType { 
  BigInteger endPort
  BigInteger startPort
}
