package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ComposeConfigInput implements RancherType {
  List<String> serviceIds
}
