package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProjectTemplate implements RancherType {
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
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  List<CatalogTemplate> stacks
}
