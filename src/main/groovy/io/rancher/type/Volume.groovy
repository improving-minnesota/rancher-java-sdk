package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Volume extends RancherType { 
  String accessMode
  String accountId
  String created
  Map<String, Object> data
  String description
  String driver
  Map<String, Object> driverOpts
  String externalId
  String hostId
  String imageId
  String instanceId
  Boolean isHostPath
  String kind
  List<MountEntry> mounts
  String name
  String removeTime
  String removed
  BigInteger sizeMb
  String stackId
  String state
  String storageDriverId
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uri
  String uuid
  String volumeTemplateId
}
