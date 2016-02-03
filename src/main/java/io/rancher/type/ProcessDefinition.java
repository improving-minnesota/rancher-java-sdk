package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ProcessDefinition extends AbstractType {
    
    private Boolean extensionBased;
    
    private String name;
    
    private Object postProcessListeners;
    
    private Object preProcessListeners;
    
    private Object processHandlers;
    
    private String resourceType;
    
    private List<StateTransition> stateTransitions;
    
    public Boolean getExtensionBased() {
        return this.extensionBased;
    }

    public void setExtensionBased(Boolean extensionBased) {
      this.extensionBased = extensionBased;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Object getPostProcessListeners() {
        return this.postProcessListeners;
    }

    public void setPostProcessListeners(Object postProcessListeners) {
      this.postProcessListeners = postProcessListeners;
    }
    
    public Object getPreProcessListeners() {
        return this.preProcessListeners;
    }

    public void setPreProcessListeners(Object preProcessListeners) {
      this.preProcessListeners = preProcessListeners;
    }
    
    public Object getProcessHandlers() {
        return this.processHandlers;
    }

    public void setProcessHandlers(Object processHandlers) {
      this.processHandlers = processHandlers;
    }
    
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    
    public List<StateTransition> getStateTransitions() {
        return this.stateTransitions;
    }

    public void setStateTransitions(List<StateTransition> stateTransitions) {
      this.stateTransitions = stateTransitions;
    }
    
}
