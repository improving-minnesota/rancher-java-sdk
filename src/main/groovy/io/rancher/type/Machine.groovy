package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Machine implements RancherType {
  String accountId
  String created
  Map<String, Object> data
  String description
  String driver
  String externalId
  String kind
  String name
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  Amazonec2Config amazonec2Config
  String authCertificateAuthority
  String authKey
  AzureConfig azureConfig
  DigitaloceanConfig digitaloceanConfig
  String dockerVersion
  Map<String, Object> engineEnv
  List<String> engineInsecureRegistry
  String engineInstallUrl
  Map<String, Object> engineLabel
  Map<String, Object> engineOpt
  List<String> engineRegistryMirror
  String engineStorageDriver
  String hostTemplateId
  Map<String, Object> labels
  PacketConfig packetConfig
}
