package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceLink implements RancherType {
  String name
  String service
  String serviceId
  String uuid
}
