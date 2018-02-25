package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProjectMember extends RancherType { 
  String created
  String description
  String externalId
  String externalIdType
  String kind
  String name
  String projectId
  String removed
  String role
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
