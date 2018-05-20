package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Volume implements RancherType {
  String accessMode
  String accountId
  String created
  Map<String, Object> data
  String description
  String externalId
  String hostId
  String imageId
  String instanceId
  String kind
  String name
  String removeTime
  String removed
  BigInteger sizeMb
  String stackId
  String state
  String storageDriverId
  String uri
  String uuid
  String volumeTemplateId
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  Boolean isHostPath
  String driver
  Map<String, Object> driverOpts
  List<MountEntry> mounts
}
