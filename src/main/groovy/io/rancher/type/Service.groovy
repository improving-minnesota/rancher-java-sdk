package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Service extends RancherType { 
  String accountId
  Boolean assignServiceIpAddress
  BigInteger createIndex
  String created
  BigInteger currentScale
  Map<String, Object> data
  String description
  String externalId
  String fqdn
  String healthState
  List<String> instanceIds
  String kind
  LaunchConfig launchConfig
  LbTargetConfig lbConfig
  Map<String, Object> linkedServices
  Map<String, Object> metadata
  String name
  List<PublicEndpoint> publicEndpoints
  String removeTime
  String removed
  Boolean retainIp
  BigInteger scale
  ScalePolicy scalePolicy
  List<SecondaryLaunchConfig> secondaryLaunchConfigs
  String selectorContainer
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
