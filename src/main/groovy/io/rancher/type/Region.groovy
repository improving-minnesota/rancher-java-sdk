package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Region extends RancherType { 
  String accountId
  String created
  String description
  String kind
  Boolean local
  String name
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String url
  String uuid
}
