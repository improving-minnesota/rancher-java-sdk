package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Stack extends RancherType { 
  String accountId
  Map<String, Object> answers
  Binding binding
  String created
  Map<String, Object> data
  String description
  String dockerCompose
  Map<String, Object> environment
  String externalId
  String group
  String healthState
  String kind
  String name
  Map<String, Object> outputs
  Map<String, Object> previousEnvironment
  String previousExternalId
  String rancherCompose
  String removeTime
  String removed
  List<String> serviceIds
  Boolean startOnCreate
  String state
  Boolean system
  Map<String, Object> templates
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
