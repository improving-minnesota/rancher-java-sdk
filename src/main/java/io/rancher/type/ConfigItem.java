package io.rancher.type;

import io.rancher.base.AbstractType;

public class ConfigItem extends AbstractType {
    
    private String name;
    
    private String sourceVersion;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getSourceVersion() {
        return this.sourceVersion;
    }

    public void setSourceVersion(String sourceVersion) {
      this.sourceVersion = sourceVersion;
    }
    
}
