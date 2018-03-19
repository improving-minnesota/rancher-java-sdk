package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class StackUpgrade implements RancherType {
  String dockerCompose
  String rancherCompose
  String externalId
  Map<String, Object> environment
  Map<String, Object> answers
  Map<String, Object> templates
}
