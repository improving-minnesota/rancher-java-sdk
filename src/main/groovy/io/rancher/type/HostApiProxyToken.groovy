package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class HostApiProxyToken implements RancherType {
  String reportedUuid
  String token
  String url
}
