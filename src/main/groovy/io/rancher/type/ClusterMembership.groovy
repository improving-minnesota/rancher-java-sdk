package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ClusterMembership implements RancherType {
  Boolean clustered
  String config
  BigInteger heartbeat
  String name
  String uuid
}
