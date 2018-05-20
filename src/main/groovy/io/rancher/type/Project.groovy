package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Project implements RancherType {
  String created
  Map<String, Object> data
  String defaultNetworkId
  String description
  String healthState
  String kind
  String name
  String projectTemplateId
  String removeTime
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String version
  BigInteger hostRemoveDelaySeconds
  Boolean allowSystemRole
  List<ProjectMember> members
  String orchestration
  Boolean virtualMachine
  ServicesPortRange servicesPortRange
  List<String> projectLinks
}
