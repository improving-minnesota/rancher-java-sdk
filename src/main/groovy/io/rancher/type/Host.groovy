package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Host implements RancherType {
  String accountId
  String agentId
  String agentState
  BigInteger computeTotal
  String created
  Map<String, Object> data
  String description
  String hostTemplateId
  String kind
  BigInteger localStorageMb
  BigInteger memory
  BigInteger milliCpu
  String name
  String physicalHostId
  String removeTime
  String removed
  String stackId
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  Map<String, Object> info
  String hostname
  String apiProxy
  String agentIpAddress
  List<String> instanceIds
  Map<String, Object> labels
  List<PublicEndpoint> publicEndpoints
  Amazonec2Config amazonec2Config
  String authCertificateAuthority
  String authKey
  AzureConfig azureConfig
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
  PacketConfig packetConfig
}
