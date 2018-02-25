package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class StackUpgrade extends RancherType { 
  Map<String, Object> answers
  String dockerCompose
  Map<String, Object> environment
  String externalId
  String rancherCompose
  Map<String, Object> templates
}
