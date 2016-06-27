package io.rancher.type;

import io.rancher.base.AbstractType;

public class Setting extends AbstractType {
    
    private String activeValue;
    
    private Boolean inDb;
    
    private String name;
    
    private String source;
    
    private String value;
    
    public String getActiveValue() {
        return this.activeValue;
    }

    public void setActiveValue(String activeValue) {
      this.activeValue = activeValue;
    }
    
    public Boolean getInDb() {
        return this.inDb;
    }

    public void setInDb(Boolean inDb) {
      this.inDb = inDb;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
      this.source = source;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
