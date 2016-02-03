package io.rancher.type;

import io.rancher.base.AbstractType;

public class RestartPolicy extends AbstractType {
    
    private Integer maximumRetryCount;
    
    private String name;
    
    public Integer getMaximumRetryCount() {
        return this.maximumRetryCount;
    }

    public void setMaximumRetryCount(Integer maximumRetryCount) {
      this.maximumRetryCount = maximumRetryCount;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
