package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ScalePolicy implements RancherType {
  BigInteger increment
  BigInteger max
  BigInteger min
}
