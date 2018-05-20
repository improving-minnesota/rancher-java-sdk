package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class KubernetesStack implements RancherType {
  String accountId
  Map<String, Object> answers
  Binding binding
  String created
  Map<String, Object> data
  String description
  Map<String, Object> environment
  String externalId
  String group
  String healthState
  String kind
  String name
  Map<String, Object> previousEnvironment
  String previousExternalId
  String removeTime
  String removed
  List<String> serviceIds
  String state
  Boolean system
  Map<String, Object> templates
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String namespace
}
