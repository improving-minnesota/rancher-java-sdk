package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Azureadconfig implements RancherType {
  String accessMode
  String adminAccountPassword
  String adminAccountUsername
  String clientId
  String domain
  Boolean enabled
  String name
  String tenantId
}
