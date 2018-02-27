package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class ExternalDnsEvent extends RancherType { 
  String accountId
  String created
  Map<String, Object> data
  String eventType
  String externalId
  String fqdn
  String kind
  String reportedAccountId
  String serviceName
  String stackName
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
