package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Certificate implements RancherType {
  String accountId
  String cert
  String certChain
  String created
  Map<String, Object> data
  String description
  String key
  String kind
  String name
  String removeTime
  String removed
  String state
  String uuid
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String certFingerprint
  String CN
  String expiresAt
  String issuer
  String issuedAt
  String algorithm
  String version
  String serialNumber
  BigInteger keySize
  List<String> subjectAlternativeNames
}
