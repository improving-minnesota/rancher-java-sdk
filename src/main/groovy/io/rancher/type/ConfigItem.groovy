package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ConfigItem extends RancherType { 
  String name
  String sourceVersion
}
