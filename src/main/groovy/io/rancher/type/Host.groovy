package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Host extends RancherType { 
  String accountId
  String agentId
  String agentIpAddress
  String agentState
  Amazonec2Config amazonec2Config
  String apiProxy
  String authCertificateAuthority
  String authKey
  AzureConfig azureConfig
  BigInteger computeTotal
  String created
  Map<String, Object> data
  String description
  DigitaloceanConfig digitaloceanConfig
  String dockerVersion
  String driver
  Map<String, Object> engineEnv
  List<String> engineInsecureRegistry
  String engineInstallUrl
  Map<String, Object> engineLabel
  Map<String, Object> engineOpt
  List<String> engineRegistryMirror
  String engineStorageDriver
  String hostTemplateId
  String hostname
  Map<String, Object> info
  List<String> instanceIds
  String kind
  Map<String, Object> labels
  BigInteger localStorageMb
  BigInteger memory
  BigInteger milliCpu
  String name
  PacketConfig packetConfig
  String physicalHostId
  List<PublicEndpoint> publicEndpoints
  String removeTime
  String removed
  String stackId
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
