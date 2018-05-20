package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ComposeConfig implements RancherType {
  String dockerComposeConfig
  String rancherComposeConfig
}
