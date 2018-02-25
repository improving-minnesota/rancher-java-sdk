package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Amazonec2Config extends RancherType { 
  String accessKey
  String ami
  String blockDurationMinutes
  String deviceName
  String endpoint
  String iamInstanceProfile
  Boolean insecureTransport
  String instanceType
  String keypairName
  Boolean monitoring
  List<String> openPort
  Boolean privateAddressOnly
  String region
  Boolean requestSpotInstance
  String retries
  String rootSize
  String secretKey
  List<String> securityGroup
  String sessionToken
  String spotPrice
  String sshKeypath
  String sshUser
  String subnetId
  String tags
  Boolean useEbsOptimizedInstance
  Boolean usePrivateAddress
  String userdata
  String volumeType
  String vpcId
  String zone
}
