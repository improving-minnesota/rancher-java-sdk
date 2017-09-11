package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class LbConfig extends AbstractType {
    
    private List<String> certificateIds;
    
    private String config;
    
    private String defaultCertificateId;
    
    private List<PortRule> portRules;
    
    private LoadBalancerCookieStickinessPolicy stickinessPolicy;
    
    public List<String> getCertificateIds() {
        return this.certificateIds;
    }

    public void setCertificateIds(List<String> certificateIds) {
      this.certificateIds = certificateIds;
    }
    
    public String getConfig() {
        return this.config;
    }

    public void setConfig(String config) {
      this.config = config;
    }
    
    public String getDefaultCertificateId() {
        return this.defaultCertificateId;
    }

    public void setDefaultCertificateId(String defaultCertificateId) {
      this.defaultCertificateId = defaultCertificateId;
    }
    
    public List<PortRule> getPortRules() {
        return this.portRules;
    }

    public void setPortRules(List<PortRule> portRules) {
      this.portRules = portRules;
    }
    
    public LoadBalancerCookieStickinessPolicy getStickinessPolicy() {
        return this.stickinessPolicy;
    }

    public void setStickinessPolicy(LoadBalancerCookieStickinessPolicy stickinessPolicy) {
      this.stickinessPolicy = stickinessPolicy;
    }
    
}
