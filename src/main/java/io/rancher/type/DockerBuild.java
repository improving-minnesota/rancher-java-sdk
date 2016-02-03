package io.rancher.type;

import io.rancher.base.AbstractType;

public class DockerBuild extends AbstractType {
    
    private String context;
    
    private String dockerfile;
    
    private Boolean forcerm;
    
    private Boolean nocache;
    
    private String remote;
    
    private Boolean rm;
    
    public String getContext() {
        return this.context;
    }

    public void setContext(String context) {
      this.context = context;
    }
    
    public String getDockerfile() {
        return this.dockerfile;
    }

    public void setDockerfile(String dockerfile) {
      this.dockerfile = dockerfile;
    }
    
    public Boolean getForcerm() {
        return this.forcerm;
    }

    public void setForcerm(Boolean forcerm) {
      this.forcerm = forcerm;
    }
    
    public Boolean getNocache() {
        return this.nocache;
    }

    public void setNocache(Boolean nocache) {
      this.nocache = nocache;
    }
    
    public String getRemote() {
        return this.remote;
    }

    public void setRemote(String remote) {
      this.remote = remote;
    }
    
    public Boolean getRm() {
        return this.rm;
    }

    public void setRm(Boolean rm) {
      this.rm = rm;
    }
    
}
