package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ConfigItem extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
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
