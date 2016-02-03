package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ExtensionImplementation extends AbstractType {
    
    private String className;
    
    private String name;
    
    private Map<String, Object> properties;
    
    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
      this.className = className;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Map<String, Object> getProperties() {
        return this.properties;
    }

    public void setProperties(Map<String, Object> properties) {
      this.properties = properties;
    }
    
}
