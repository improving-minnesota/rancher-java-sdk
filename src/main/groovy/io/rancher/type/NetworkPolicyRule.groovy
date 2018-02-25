package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class NetworkPolicyRule extends RancherType { 
  String action
  NetworkPolicyRuleBetween between
  NetworkPolicyRuleMember from
  List<String> ports
  NetworkPolicyRuleMember to
  String within
}
