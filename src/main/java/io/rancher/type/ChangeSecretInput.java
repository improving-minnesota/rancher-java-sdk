package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ChangeSecretInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String newSecret;
    
    private String oldSecret;
    
    public String getNewSecret() {
        return this.newSecret;
    }

    public void setNewSecret(String newSecret) {
      this.newSecret = newSecret;
    }
    
    public String getOldSecret() {
        return this.oldSecret;
    }

    public void setOldSecret(String oldSecret) {
      this.oldSecret = oldSecret;
    }
    
}
