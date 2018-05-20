package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class MachineDriver implements RancherType {
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String url
  String externalId
  Boolean builtin
  Boolean defaultActive
  Boolean activateOnCreate
  String checksum
  String uiUrl
}
