package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LogConfig extends RancherType { 
  Map<String, Object> config
  String driver
}
