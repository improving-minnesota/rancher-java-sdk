package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalService implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String externalId
  String fqdn
  String healthState
  List<String> instanceIds
  String kind
  LaunchConfig launchConfig
  Map<String, Object> linkedServices
  Map<String, Object> metadata
  String name
  String removeTime
  String removed
  String stackId
  Boolean startOnCreate
  String state
  Boolean system
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  ServiceUpgrade upgrade
  String uuid
  List<String> externalIpAddresses
  String hostname
  InstanceHealthCheck healthCheck
}
