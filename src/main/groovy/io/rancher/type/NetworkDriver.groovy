package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class NetworkDriver extends RancherType { 
  String accountId
  Map<String, Object> cniConfig
  String created
  DefaultNetwork defaultNetwork
  String description
  String kind
  String name
  Map<String, Object> networkMetadata
  String removed
  String serviceId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
