package io.rancher.type;

import io.rancher.base.AbstractType;

public class HaproxyConfig extends AbstractType {
    
    private String defaults;
    
    private String global;
    
    public String getDefaults() {
        return this.defaults;
    }

    public void setDefaults(String defaults) {
      this.defaults = defaults;
    }
    
    public String getGlobal() {
        return this.global;
    }

    public void setGlobal(String global) {
      this.global = global;
    }
    
}
