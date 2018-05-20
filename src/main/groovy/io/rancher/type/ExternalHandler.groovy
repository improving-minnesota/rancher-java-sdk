package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalHandler implements RancherType {
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  BigInteger priority
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  List<ExternalHandlerProcessConfig> processConfigs
  BigInteger retries
  BigInteger timeoutMillis
}
