package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class SecretReference extends RancherType { 
  String gid
  String mode
  String name
  String secretId
  String uid
}
