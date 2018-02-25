package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class KubernetesStackUpgrade extends RancherType { 
  Map<String, Object> answers
  Map<String, Object> environment
  String externalId
  Map<String, Object> templates
}
