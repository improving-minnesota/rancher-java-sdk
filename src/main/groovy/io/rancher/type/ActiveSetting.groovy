package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ActiveSetting implements RancherType {
  Map<String, Object> activeValue
  Boolean inDb
  String name
  String source
  String value
}
