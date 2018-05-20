package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class NetworkDriver implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String kind
  String name
  String removeTime
  String removed
  String serviceId
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  DefaultNetwork defaultNetwork
  Map<String, Object> cniConfig
  Map<String, Object> networkMetadata
}
