package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class PublicEndpoint extends RancherType { 
  String hostId
  String instanceId
  String ipAddress
  BigInteger port
  String serviceId
}
