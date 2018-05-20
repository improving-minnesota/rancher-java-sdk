package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class StatsAccess implements RancherType {
  String token
  String url
}
