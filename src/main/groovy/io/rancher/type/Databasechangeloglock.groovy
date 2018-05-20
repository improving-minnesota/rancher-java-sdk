package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Databasechangeloglock implements RancherType {
  Boolean locked
  String lockedby
  String lockgranted
}
