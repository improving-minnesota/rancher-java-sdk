package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalHandlerExternalHandlerProcessMap extends RancherType { 
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
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
