package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class SetProjectMembersInput implements RancherType {
  List<ProjectMember> members
}
