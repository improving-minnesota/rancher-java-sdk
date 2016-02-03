package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class TypeDocumentation extends AbstractType {
    
    private String description;
    
    private Map<String, Object> resourceFields;
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Map<String, Object> getResourceFields() {
        return this.resourceFields;
    }

    public void setResourceFields(Map<String, Object> resourceFields) {
      this.resourceFields = resourceFields;
    }
    
}
