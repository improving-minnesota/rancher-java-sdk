package io.rancher.type;

import io.rancher.base.AbstractType;

public class FieldDocumentation extends AbstractType {
    
    private String description;
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
}
