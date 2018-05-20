package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class HaConfigInput implements RancherType {
  String cert
  String certChain
  BigInteger clusterSize
  String hostRegistrationUrl
  Boolean httpEnabled
  BigInteger httpPort
  BigInteger httpsPort
  String key
  BigInteger ppHttpPort
  BigInteger ppHttpsPort
  BigInteger redisPort
  Boolean swarmEnabled
  BigInteger swarmPort
  BigInteger zookeeperClientPort
  BigInteger zookeeperLeaderPort
  BigInteger zookeeperQuorumPort
}
