package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProcessDefinition implements RancherType {
  Boolean extensionBased
  String name
  ExtensionPoint postProcessListeners
  ExtensionPoint preProcessListeners
  ExtensionPoint processHandlers
  String resourceType
  List<StateTransition> stateTransitions
}
