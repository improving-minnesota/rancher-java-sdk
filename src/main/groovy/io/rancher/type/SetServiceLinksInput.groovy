package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class SetServiceLinksInput extends RancherType { 
  List<ServiceLink> serviceLinks
}
