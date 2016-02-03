package io.rancher.type;

import io.rancher.base.AbstractType;

public class PacketConfig extends AbstractType {
    
    private String apiKey;
    
    private String billingCycle;
    
    private String facilityCode;
    
    private String os;
    
    private String plan;
    
    private String projectId;
    
    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
      this.apiKey = apiKey;
    }
    
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
      this.billingCycle = billingCycle;
    }
    
    public String getFacilityCode() {
        return this.facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
      this.facilityCode = facilityCode;
    }
    
    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
      this.os = os;
    }
    
    public String getPlan() {
        return this.plan;
    }

    public void setPlan(String plan) {
      this.plan = plan;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
}
