package io.rancher.type;

import io.rancher.base.AbstractType;

public class HaConfigInput extends AbstractType {
    
    private String cert;
    
    private String certChain;
    
    private Integer clusterSize;
    
    private String hostRegistrationUrl;
    
    private Boolean httpEnabled;
    
    private Integer httpPort;
    
    private Integer httpsPort;
    
    private String key;
    
    private Integer ppHttpPort;
    
    private Integer ppHttpsPort;
    
    private Integer redisPort;
    
    private Boolean swarmEnabled;
    
    private Integer swarmPort;
    
    private Integer zookeeperClientPort;
    
    private Integer zookeeperLeaderPort;
    
    private Integer zookeeperQuorumPort;
    
    public String getCert() {
        return this.cert;
    }

    public void setCert(String cert) {
      this.cert = cert;
    }
    
    public String getCertChain() {
        return this.certChain;
    }

    public void setCertChain(String certChain) {
      this.certChain = certChain;
    }
    
    public Integer getClusterSize() {
        return this.clusterSize;
    }

    public void setClusterSize(Integer clusterSize) {
      this.clusterSize = clusterSize;
    }
    
    public String getHostRegistrationUrl() {
        return this.hostRegistrationUrl;
    }

    public void setHostRegistrationUrl(String hostRegistrationUrl) {
      this.hostRegistrationUrl = hostRegistrationUrl;
    }
    
    public Boolean getHttpEnabled() {
        return this.httpEnabled;
    }

    public void setHttpEnabled(Boolean httpEnabled) {
      this.httpEnabled = httpEnabled;
    }
    
    public Integer getHttpPort() {
        return this.httpPort;
    }

    public void setHttpPort(Integer httpPort) {
      this.httpPort = httpPort;
    }
    
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
      this.httpsPort = httpsPort;
    }
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public Integer getPpHttpPort() {
        return this.ppHttpPort;
    }

    public void setPpHttpPort(Integer ppHttpPort) {
      this.ppHttpPort = ppHttpPort;
    }
    
    public Integer getPpHttpsPort() {
        return this.ppHttpsPort;
    }

    public void setPpHttpsPort(Integer ppHttpsPort) {
      this.ppHttpsPort = ppHttpsPort;
    }
    
    public Integer getRedisPort() {
        return this.redisPort;
    }

    public void setRedisPort(Integer redisPort) {
      this.redisPort = redisPort;
    }
    
    public Boolean getSwarmEnabled() {
        return this.swarmEnabled;
    }

    public void setSwarmEnabled(Boolean swarmEnabled) {
      this.swarmEnabled = swarmEnabled;
    }
    
    public Integer getSwarmPort() {
        return this.swarmPort;
    }

    public void setSwarmPort(Integer swarmPort) {
      this.swarmPort = swarmPort;
    }
    
    public Integer getZookeeperClientPort() {
        return this.zookeeperClientPort;
    }

    public void setZookeeperClientPort(Integer zookeeperClientPort) {
      this.zookeeperClientPort = zookeeperClientPort;
    }
    
    public Integer getZookeeperLeaderPort() {
        return this.zookeeperLeaderPort;
    }

    public void setZookeeperLeaderPort(Integer zookeeperLeaderPort) {
      this.zookeeperLeaderPort = zookeeperLeaderPort;
    }
    
    public Integer getZookeeperQuorumPort() {
        return this.zookeeperQuorumPort;
    }

    public void setZookeeperQuorumPort(Integer zookeeperQuorumPort) {
      this.zookeeperQuorumPort = zookeeperQuorumPort;
    }
    
}
