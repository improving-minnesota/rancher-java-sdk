package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class BlkioDeviceOption implements RancherType {
  BigInteger readBps
  BigInteger readIops
  BigInteger weight
  BigInteger writeBps
  BigInteger writeIops
}
