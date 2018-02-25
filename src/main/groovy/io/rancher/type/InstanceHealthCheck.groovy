package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class InstanceHealthCheck extends RancherType { 
  BigInteger healthyThreshold
  BigInteger initializingTimeout
  BigInteger interval
  String name
  BigInteger port
  RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig
  BigInteger reinitializingTimeout
  String requestLine
  BigInteger responseTimeout
  String strategy
  BigInteger unhealthyThreshold
}
