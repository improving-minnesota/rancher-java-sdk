package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.Map;

public class TypeDocumentation extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
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
