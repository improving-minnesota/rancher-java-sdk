package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class HaproxyConfig extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
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
