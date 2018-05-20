package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class PortRule implements RancherType {
  String backendName
  String environment
  String hostname
  String path
  BigInteger priority
  String protocol
  String region
  String selector
  String serviceId
  BigInteger sourcePort
  BigInteger targetPort
  BigInteger weight
}
