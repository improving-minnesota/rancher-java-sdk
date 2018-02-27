package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class KubernetesService extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String description
  String externalId
  String healthState
  List<String> instanceIds
  String kind
  Map<String, Object> linkedServices
  String name
  String removeTime
  String removed
  String selectorContainer
  String stackId
  String state
  Boolean system
  Map<String, Object> template
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String vip
}
