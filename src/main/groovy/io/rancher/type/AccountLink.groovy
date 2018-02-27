package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class AccountLink extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String description
  Boolean external
  String kind
  String linkedAccount
  String linkedRegion
  String name
  String removeTime
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
