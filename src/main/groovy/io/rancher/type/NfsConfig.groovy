package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class NfsConfig extends RancherType { 
  String mountOptions
  String server
  String share
}
