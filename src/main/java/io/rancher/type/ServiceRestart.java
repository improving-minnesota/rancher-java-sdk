package io.rancher.type;

import io.rancher.base.AbstractType;

public class ServiceRestart extends AbstractType {
    
    private RollingRestartStrategy rollingRestartStrategy;
    
    public RollingRestartStrategy getRollingRestartStrategy() {
        return this.rollingRestartStrategy;
    }

    public void setRollingRestartStrategy(RollingRestartStrategy rollingRestartStrategy) {
      this.rollingRestartStrategy = rollingRestartStrategy;
    }
    
}
