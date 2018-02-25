package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class DigitaloceanConfig extends RancherType { 
  String accessToken
  Boolean backups
  String image
  Boolean ipv6
  Boolean privateNetworking
  String region
  String size
  String sshKeyFingerprint
  String sshKeyPath
  String sshPort
  String sshUser
  String tags
  String userdata
}
