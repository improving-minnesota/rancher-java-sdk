package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LoadBalancerService extends RancherType { 
  String accountId
  Boolean assignServiceIpAddress
  String created
  BigInteger currentScale
  String description
  String externalId
  String fqdn
  String healthState
  List<String> instanceIds
  String kind
  LaunchConfig launchConfig
  LbConfig lbConfig
  Map<String, Object> linkedServices
  Map<String, Object> metadata
  String name
  List<PublicEndpoint> publicEndpoints
  String removed
  Boolean retainIp
  BigInteger scale
  ScalePolicy scalePolicy
  String selectorLink
  String stackId
  Boolean startOnCreate
  String state
  Boolean system
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  ServiceUpgrade upgrade
  String uuid
  String vip
}
