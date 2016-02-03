package io.rancher.type;

import io.rancher.base.AbstractType;

public class ExternalHandlerProcessConfig extends AbstractType {
    
    private String name;
    
    private String onError;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getOnError() {
        return this.onError;
    }

    public void setOnError(String onError) {
      this.onError = onError;
    }
    
}
