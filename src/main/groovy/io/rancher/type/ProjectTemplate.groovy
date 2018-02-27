package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProjectTemplate extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String description
  String externalId
  Boolean isPublic
  String kind
  String name
  String removeTime
  String removed
  List<CatalogTemplate> stacks
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
