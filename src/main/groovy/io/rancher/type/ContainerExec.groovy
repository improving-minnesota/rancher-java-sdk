package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ContainerExec implements RancherType {
  Boolean attachStdin
  Boolean attachStdout
  List<String> command
  Boolean tty
}
