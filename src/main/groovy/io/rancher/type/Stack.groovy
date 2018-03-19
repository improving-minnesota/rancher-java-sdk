package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Stack implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String externalId
  String group
  String healthState
  String kind
  String name
  String removeTime
  String removed
  String state
  Boolean system
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String dockerCompose
  String rancherCompose
  Map<String, Object> environment
  Map<String, Object> answers
  Map<String, Object> templates
  String previousExternalId
  Map<String, Object> previousEnvironment
  Boolean startOnCreate
  Map<String, Object> outputs
  Binding binding
  List<String> serviceIds
}
