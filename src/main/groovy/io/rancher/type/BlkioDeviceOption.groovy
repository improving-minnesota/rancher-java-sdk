package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class BlkioDeviceOption extends RancherType { 
  BigInteger readBps
  BigInteger readIops
  BigInteger weight
  BigInteger writeBps
  BigInteger writeIops
}
