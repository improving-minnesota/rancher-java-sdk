package io.rancher.type;

import io.rancher.base.AbstractType;

public class SecretReference extends AbstractType {
    
    private String gid;
    
    private String mode;
    
    private String name;
    
    private String secretId;
    
    private String uid;
    
    public String getGid() {
        return this.gid;
    }

    public void setGid(String gid) {
      this.gid = gid;
    }
    
    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
      this.mode = mode;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getSecretId() {
        return this.secretId;
    }

    public void setSecretId(String secretId) {
      this.secretId = secretId;
    }
    
    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
      this.uid = uid;
    }
    
}
