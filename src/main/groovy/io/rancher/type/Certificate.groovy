package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Certificate extends RancherType { 
  String accountId
  String algorithm
  String cN
  String cert
  String certChain
  String certFingerprint
  String created
  Map<String, Object> data
  String description
  String expiresAt
  String issuedAt
  String issuer
  String key
  BigInteger keySize
  String kind
  String name
  String removeTime
  String removed
  String serialNumber
  String state
  List<String> subjectAlternativeNames
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String version
}
