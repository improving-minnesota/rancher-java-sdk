package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class NetworkPolicyRuleBetween implements RancherType {
  String groupBy
  String selector
}
