package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class DefaultNetwork extends RancherType { 
  String accountId
  String created
  String defaultPolicyAction
  String description
  List<String> dns
  List<String> dnsSearch
  Boolean hostPorts
  String kind
  Map<String, Object> metadata
  String name
  List<NetworkPolicyRule> policy
  String removed
  String state
  List<Subnet> subnets
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
