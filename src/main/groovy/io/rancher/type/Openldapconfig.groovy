package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Openldapconfig extends RancherType { 
  String accessMode
  List<Identity> allowedIdentities
  BigInteger connectionTimeout
  String domain
  Boolean enabled
  String groupDNField
  String groupMemberMappingAttribute
  String groupMemberUserAttribute
  String groupNameField
  String groupObjectClass
  String groupSearchDomain
  String groupSearchField
  String loginDomain
  String name
  BigInteger port
  String server
  String serviceAccountPassword
  String serviceAccountUsername
  Boolean tls
  BigInteger userDisabledBitMask
  String userEnabledAttribute
  String userLoginField
  String userMemberAttribute
  String userNameField
  String userObjectClass
  String userSearchField
}
