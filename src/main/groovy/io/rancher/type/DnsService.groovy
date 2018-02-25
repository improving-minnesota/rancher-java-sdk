package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class DnsService extends RancherType { 
  String accountId
  Boolean assignServiceIpAddress
  String created
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
  String removed
  Boolean retainIp
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
}
