package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class VirtualMachineDisk implements RancherType {
  String driver
  String name
  Map<String, Object> opts
  BigInteger readIops
  Boolean root
  String size
  BigInteger writeIops
}
