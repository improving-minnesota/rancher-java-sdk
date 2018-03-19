package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Network implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String networkDriverId
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  List<String> dns
  List<String> dnsSearch
  Map<String, Object> metadata
  List<Subnet> subnets
  Boolean hostPorts
  String defaultPolicyAction
  List<NetworkPolicyRule> policy
}
