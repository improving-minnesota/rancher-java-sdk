package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class AddRemoveServiceLinkInput implements RancherType {
  ServiceLink serviceLink
}
