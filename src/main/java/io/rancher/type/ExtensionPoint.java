package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ExtensionPoint extends AbstractType {
    
    private String excludeSetting;
    
    private List<ExtensionImplementation> implementations;
    
    private String includeSetting;
    
    private String listSetting;
    
    private String name;
    
    public String getExcludeSetting() {
        return this.excludeSetting;
    }

    public void setExcludeSetting(String excludeSetting) {
      this.excludeSetting = excludeSetting;
    }
    
    public List<ExtensionImplementation> getImplementations() {
        return this.implementations;
    }

    public void setImplementations(List<ExtensionImplementation> implementations) {
      this.implementations = implementations;
    }
    
    public String getIncludeSetting() {
        return this.includeSetting;
    }

    public void setIncludeSetting(String includeSetting) {
      this.includeSetting = includeSetting;
    }
    
    public String getListSetting() {
        return this.listSetting;
    }

    public void setListSetting(String listSetting) {
      this.listSetting = listSetting;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
