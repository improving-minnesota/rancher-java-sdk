package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Publish extends RancherType { 
  Map<String, Object> data
  String name
  List<String> previousIds
  String publisher
  String resourceId
  String resourceType
  BigInteger time
  String transitioning
  String transitioningInternalMessage
  String transitioningMessage
  BigInteger transitioningProgress
}
