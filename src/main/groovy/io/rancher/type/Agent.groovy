package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Agent extends RancherType { 
  String accountId
  String agentResourcesAccountId
  String created
  Map<String, Object> data
  String description
  List<ExternalCredential> externalCredentials
  String externalId
  String kind
  Map<String, Object> labels
  Boolean managedConfig
  String name
  String publicValue
  String removeTime
  String removed
  String secretValue
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uri
  String uuid
}
