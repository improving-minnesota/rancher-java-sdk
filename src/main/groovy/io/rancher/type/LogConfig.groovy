package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LogConfig implements RancherType {
  Map<String, Object> config
  String driver
}
