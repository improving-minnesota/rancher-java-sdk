package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Machine extends RancherType { 
  String accountId
  Amazonec2Config amazonec2Config
  String authCertificateAuthority
  String authKey
  AzureConfig azureConfig
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
  String externalId
  String hostTemplateId
  String kind
  Map<String, Object> labels
  String name
  PacketConfig packetConfig
  String removeTime
  String removed
  String state
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
}
