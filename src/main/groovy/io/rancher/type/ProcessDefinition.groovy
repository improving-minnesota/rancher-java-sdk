package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ProcessDefinition extends RancherType { 
  Boolean extensionBased
  String name
  Object postProcessListeners
  Object preProcessListeners
  Object processHandlers
  String resourceType
  List<StateTransition> stateTransitions
}
