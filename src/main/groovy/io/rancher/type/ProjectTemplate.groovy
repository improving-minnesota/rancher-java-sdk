package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProjectTemplate extends RancherType { 
  String accountId
  String created
  String description
  String externalId
  String kind
  String name
  String removed
  List<CatalogTemplate> stacks
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
