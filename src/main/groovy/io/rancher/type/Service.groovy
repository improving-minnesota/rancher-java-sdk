package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Service implements RancherType {
  String accountId
  BigInteger createIndex
  String created
  Map<String, Object> data
  String description
  String externalId
  String healthState
  String kind
  String name
  String removeTime
  String removed
  String selectorContainer
  String selectorLink
  String stackId
  String state
  Boolean system
  String uuid
  String vip
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  BigInteger scale
  BigInteger currentScale
  ScalePolicy scalePolicy
  LaunchConfig launchConfig
  ServiceUpgrade upgrade
  List<SecondaryLaunchConfig> secondaryLaunchConfigs
  Map<String, Object> metadata
  String fqdn
  List<PublicEndpoint> publicEndpoints
  Boolean retainIp
  Boolean assignServiceIpAddress
  Boolean startOnCreate
  Map<String, Object> linkedServices
  List<String> instanceIds
  LbTargetConfig lbConfig
}
