package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Agent implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String externalId
  String kind
  Boolean managedConfig
  String name
  String removeTime
  String removed
  String state
  String uri
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String publicValue
  String secretValue
  Map<String, Object> labels
  List<ExternalCredential> externalCredentials
  String agentResourcesAccountId
}
