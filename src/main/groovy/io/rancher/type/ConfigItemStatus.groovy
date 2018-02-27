package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ConfigItemStatus extends RancherType { 
  String accountId
  String agentId
  String appliedUpdated
  BigInteger appliedVersion
  String name
  String requestedUpdated
  BigInteger requestedVersion
  String sourceVersion
}
