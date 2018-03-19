package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class NetworkPolicyRuleMember implements RancherType {
  String selector
}
