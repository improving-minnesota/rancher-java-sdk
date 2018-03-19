package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ChangeSecretInput implements RancherType {
  String oldSecret
  String newSecret
}
