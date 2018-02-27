package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalHandler extends RancherType { 
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  BigInteger priority
  List<ExternalHandlerProcessConfig> processConfigs
  String removeTime
  String removed
  BigInteger retries
  String state
  BigInteger timeoutMillis
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
