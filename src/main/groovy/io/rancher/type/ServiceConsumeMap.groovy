package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceConsumeMap extends RancherType { 
  String accountId
  String consumedService
  String consumedServiceId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  List<String> ports
  String removeTime
  String removed
  String serviceId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
