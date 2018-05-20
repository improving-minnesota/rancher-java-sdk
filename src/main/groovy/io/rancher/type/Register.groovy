package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Register implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String key
  String kind
  String name
  String removeTime
  String removed
  Map<String, Object> resourceData
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String accessKey
  String secretKey
}
