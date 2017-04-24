package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.Map;

public class LogConfig extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Map<String, Object> config;
    
    private String driver;
    
    public Map<String, Object> getConfig() {
        return this.config;
    }

    public void setConfig(Map<String, Object> config) {
      this.config = config;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
}
