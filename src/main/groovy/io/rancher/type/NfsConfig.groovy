package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class NfsConfig implements RancherType {
  String server
  String share
  String mountOptions
}
