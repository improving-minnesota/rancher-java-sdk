package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ScalePolicy extends RancherType { 
  BigInteger increment
  BigInteger max
  BigInteger min
}
