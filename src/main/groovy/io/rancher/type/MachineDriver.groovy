package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class MachineDriver extends RancherType { 
  Boolean activateOnCreate
  Boolean builtin
  String checksum
  String created
  Map<String, Object> data
  Boolean defaultActive
  String description
  String externalId
  String kind
  String name
  String removeTime
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uiUrl
  String url
  String uuid
}
