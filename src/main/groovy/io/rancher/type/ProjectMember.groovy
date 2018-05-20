package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProjectMember implements RancherType {
  String created
  Map<String, Object> data
  String description
  String externalId
  String externalIdType
  String kind
  String name
  String projectId
  String removeTime
  String removed
  String role
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
