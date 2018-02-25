package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ServiceBinding extends RancherType { 
  Map<String, Object> labels
  List<String> ports
}
