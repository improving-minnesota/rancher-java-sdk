package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class LoadBalancerConfig extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private HaproxyConfig haproxyConfig;
    
    private LoadBalancerCookieStickinessPolicy lbCookieStickinessPolicy;
    
    public HaproxyConfig getHaproxyConfig() {
        return this.haproxyConfig;
    }

    public void setHaproxyConfig(HaproxyConfig haproxyConfig) {
      this.haproxyConfig = haproxyConfig;
    }
    
    public LoadBalancerCookieStickinessPolicy getLbCookieStickinessPolicy() {
        return this.lbCookieStickinessPolicy;
    }

    public void setLbCookieStickinessPolicy(LoadBalancerCookieStickinessPolicy lbCookieStickinessPolicy) {
      this.lbCookieStickinessPolicy = lbCookieStickinessPolicy;
    }
    
}
