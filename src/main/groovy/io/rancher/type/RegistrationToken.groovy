package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class RegistrationToken extends RancherType { 
  String accountId
  String command
  String created
  String description
  String image
  String kind
  String name
  String registrationUrl
  String removed
  String state
  String token
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
