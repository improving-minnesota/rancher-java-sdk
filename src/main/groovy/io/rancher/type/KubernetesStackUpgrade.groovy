package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class KubernetesStackUpgrade implements RancherType {
  Map<String, Object> templates
  String externalId
  Map<String, Object> environment
  Map<String, Object> answers
}
