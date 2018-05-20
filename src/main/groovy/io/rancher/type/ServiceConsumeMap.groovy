package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceConsumeMap implements RancherType {
  String accountId
  String consumedService
  String consumedServiceId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String removeTime
  String removed
  String serviceId
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  List<String> ports
}
