package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LoadBalancerCookieStickinessPolicy implements RancherType {
  String cookie
  String domain
  Boolean indirect
  String mode
  String name
  Boolean nocache
  Boolean postonly
}
