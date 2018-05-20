package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceProxy implements RancherType {
  BigInteger port
  String scheme
  String service
  String token
  String url
}
