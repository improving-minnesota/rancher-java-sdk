package io.rancher.type;

import io.rancher.base.AbstractType;

public class InstanceHealthCheck extends AbstractType {
    
    private Integer healthyThreshold;
    
    private Integer initializingTimeout;
    
    private Integer interval;
    
    private String name;
    
    private Integer port;
    
    private RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig;
    
    private Integer reinitializingTimeout;
    
    private String requestLine;
    
    private Integer responseTimeout;
    
    private String strategy;
    
    private Integer unhealthyThreshold;
    
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public void setHealthyThreshold(Integer healthyThreshold) {
      this.healthyThreshold = healthyThreshold;
    }
    
    public Integer getInitializingTimeout() {
        return this.initializingTimeout;
    }

    public void setInitializingTimeout(Integer initializingTimeout) {
      this.initializingTimeout = initializingTimeout;
    }
    
    public Integer getInterval() {
        return this.interval;
    }

    public void setInterval(Integer interval) {
      this.interval = interval;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public RecreateOnQuorumStrategyConfig getRecreateOnQuorumStrategyConfig() {
        return this.recreateOnQuorumStrategyConfig;
    }

    public void setRecreateOnQuorumStrategyConfig(RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig) {
      this.recreateOnQuorumStrategyConfig = recreateOnQuorumStrategyConfig;
    }
    
    public Integer getReinitializingTimeout() {
        return this.reinitializingTimeout;
    }

    public void setReinitializingTimeout(Integer reinitializingTimeout) {
      this.reinitializingTimeout = reinitializingTimeout;
    }
    
    public String getRequestLine() {
        return this.requestLine;
    }

    public void setRequestLine(String requestLine) {
      this.requestLine = requestLine;
    }
    
    public Integer getResponseTimeout() {
        return this.responseTimeout;
    }

    public void setResponseTimeout(Integer responseTimeout) {
      this.responseTimeout = responseTimeout;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
      this.unhealthyThreshold = unhealthyThreshold;
    }
    
}
