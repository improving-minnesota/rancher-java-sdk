package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Region implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String kind
  Boolean local
  String name
  String publicValue
  String removeTime
  String removed
  String secretValue
  String state
  String url
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
