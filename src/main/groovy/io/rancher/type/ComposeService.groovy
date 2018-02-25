package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ComposeService extends RancherType { 
  String accountId
  String created
  BigInteger currentScale
  String description
  String externalId
  String fqdn
  String healthState
  List<String> instanceIds
  String kind
  LaunchConfig launchConfig
  Map<String, Object> linkedServices
  String name
  List<PublicEndpoint> publicEndpoints
  String removed
  BigInteger scale
  ScalePolicy scalePolicy
  String selectorContainer
  String selectorLink
  String stackId
  Boolean startOnCreate
  String state
  Boolean system
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String vip
}
