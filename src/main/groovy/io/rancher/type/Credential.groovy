package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Credential extends RancherType { 
  String accountId
  String created
  String description
  String kind
  String name
  String publicValue
  String removed
  Password secretValue
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
