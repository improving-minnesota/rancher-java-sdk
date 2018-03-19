package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Identity implements RancherType {
  String all
  String externalId
  String externalIdType
  String login
  String name
  String profilePicture
  String profileUrl
  String projectId
  String role
  Boolean user
}
