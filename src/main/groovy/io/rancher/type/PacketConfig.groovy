package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class PacketConfig implements RancherType {
  String apiKey
  String billingCycle
  String facilityCode
  String os
  String plan
  String projectId
}
