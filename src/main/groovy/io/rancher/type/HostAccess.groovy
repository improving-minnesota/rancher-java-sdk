package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class HostAccess extends RancherType { 
  String token
  String url
}
