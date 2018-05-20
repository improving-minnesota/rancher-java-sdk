package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class LocalAuthConfig implements RancherType {
  String accessMode
  Boolean enabled
  String name
  Password password
  String username
}
