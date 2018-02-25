package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalService extends RancherType { 
  String accountId
  String created
  String description
  String externalId
  List<String> externalIpAddresses
  String fqdn
  InstanceHealthCheck healthCheck
  String healthState
  String hostname
  List<String> instanceIds
  String kind
  LaunchConfig launchConfig
  Map<String, Object> linkedServices
  Map<String, Object> metadata
  String name
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
}
