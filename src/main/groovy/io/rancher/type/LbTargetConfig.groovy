package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LbTargetConfig extends RancherType { 
  List<TargetPortRule> portRules
}
