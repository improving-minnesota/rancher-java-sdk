package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class AuditLog implements RancherType {
  String accountId
  String authType
  String authenticatedAsAccountId
  String authenticatedAsIdentityId
  String clientIp
  String created
  String description
  String eventType
  String kind
  BigInteger resourceId
  String resourceType
  BigInteger responseCode
  String requestObject
  String responseObject
}
