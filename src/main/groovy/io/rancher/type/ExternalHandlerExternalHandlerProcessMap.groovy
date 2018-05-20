package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalHandlerExternalHandlerProcessMap implements RancherType {
  String created
  Map<String, Object> data
  String description
  String eventName
  String externalHandlerId
  String externalHandlerProcessId
  String kind
  String name
  String onError
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
}
