package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class RegistryCredential extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String publicValue
  String registryId
  String removeTime
  String removed
  Password secretValue
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
