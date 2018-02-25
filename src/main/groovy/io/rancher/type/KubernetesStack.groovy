package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class KubernetesStack extends RancherType { 
  String accountId
  Map<String, Object> answers
  Binding binding
  String created
  String description
  Map<String, Object> environment
  String externalId
  String group
  String healthState
  String kind
  String name
  String namespace
  Map<String, Object> previousEnvironment
  String previousExternalId
  String removed
  List<String> serviceIds
  String state
  Boolean system
  Map<String, Object> templates
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
