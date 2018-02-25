package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class AzureConfig extends RancherType { 
  String availabilitySet
  String clientId
  String clientSecret
  String customData
  String dns
  String dockerPort
  String environment
  String image
  String location
  Boolean noPublicIp
  List<String> openPort
  String privateIpAddress
  String resourceGroup
  String size
  String sshUser
  Boolean staticPublicIp
  String storageType
  String subnet
  String subnetPrefix
  String subscriptionId
  Boolean usePrivateIp
  String vnet
}
