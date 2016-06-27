package io.rancher.type;

import io.rancher.base.AbstractType;

public class LoadBalancerConfig extends AbstractType {
    
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
