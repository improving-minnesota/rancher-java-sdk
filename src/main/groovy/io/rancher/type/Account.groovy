package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Account extends RancherType { 
  String created
  String description
  String kind
  String name
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String version
}
