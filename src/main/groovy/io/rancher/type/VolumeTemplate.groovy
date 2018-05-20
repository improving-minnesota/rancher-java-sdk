package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class VolumeTemplate implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String driver
  Boolean external
  String kind
  String name
  Boolean perContainer
  String removeTime
  String removed
  String stackId
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  Map<String, Object> driverOpts
}
