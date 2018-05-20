package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LbConfig implements RancherType {
  String config
  List<PortRule> portRules
  List<String> certificateIds
  String defaultCertificateId
  LoadBalancerCookieStickinessPolicy stickinessPolicy
}
