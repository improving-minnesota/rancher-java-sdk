package io.rancher.type;

import io.rancher.base.AbstractType;

public class ChangeSecretInput extends AbstractType {
    
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
