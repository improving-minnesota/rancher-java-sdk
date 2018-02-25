package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LbConfig extends RancherType { 
  List<String> certificateIds
  String config
  String defaultCertificateId
  List<PortRule> portRules
  LoadBalancerCookieStickinessPolicy stickinessPolicy
}
