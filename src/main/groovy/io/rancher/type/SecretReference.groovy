package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class SecretReference implements RancherType {
  String gid
  String mode
  String name
  String secretId
  String uid
}
