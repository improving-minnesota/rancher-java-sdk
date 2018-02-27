package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Project extends RancherType { 
  Boolean allowSystemRole
  String created
  Map<String, Object> data
  String defaultNetworkId
  String description
  String healthState
  BigInteger hostRemoveDelaySeconds
  String kind
  List<ProjectMember> members
  String name
  String orchestration
  List<String> projectLinks
  String projectTemplateId
  String removeTime
  String removed
  ServicesPortRange servicesPortRange
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String version
  Boolean virtualMachine
}
