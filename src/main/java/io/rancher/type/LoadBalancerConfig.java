package io.rancher.type;

import io.rancher.base.AbstractType;

public class LoadBalancerConfig extends AbstractType {
    
    private LoadBalancerAppCookieStickinessPolicy appCookieStickinessPolicy;
    
    private HaproxyConfig haproxyConfig;
    
    private LoadBalancerCookieStickinessPolicy lbCookieStickinessPolicy;
    
    public LoadBalancerAppCookieStickinessPolicy getAppCookieStickinessPolicy() {
        return this.appCookieStickinessPolicy;
    }

    public void setAppCookieStickinessPolicy(LoadBalancerAppCookieStickinessPolicy appCookieStickinessPolicy) {
      this.appCookieStickinessPolicy = appCookieStickinessPolicy;
    }
    
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
