package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class KubernetesStack extends AbstractType {
    
    private String accountId;
    
    private Map<String, Object> answers;
    
    private Binding binding;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private Map<String, Object> environment;
    
    private String externalId;
    
    private String group;
    
    private String healthState;
    
    private String kind;
    
    private String name;
    
    private String namespace;
    
    private Map<String, Object> previousEnvironment;
    
    private String previousExternalId;
    
    private String removeTime;
    
    private String removed;
    
    private List<String> serviceIds;
    
    private String state;
    
    private Boolean system;
    
    private Map<String, Object> templates;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
    }
    
    public Binding getBinding() {
        return this.binding;
    }

    public void setBinding(Binding binding) {
      this.binding = binding;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
      this.data = data;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Map<String, Object> getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Map<String, Object> environment) {
      this.environment = environment;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
      this.group = group;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
      this.namespace = namespace;
    }
    
    public Map<String, Object> getPreviousEnvironment() {
        return this.previousEnvironment;
    }

    public void setPreviousEnvironment(Map<String, Object> previousEnvironment) {
      this.previousEnvironment = previousEnvironment;
    }
    
    public String getPreviousExternalId() {
        return this.previousExternalId;
    }

    public void setPreviousExternalId(String previousExternalId) {
      this.previousExternalId = previousExternalId;
    }
    
    public String getRemoveTime() {
        return this.removeTime;
    }

    public void setRemoveTime(String removeTime) {
      this.removeTime = removeTime;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getServiceIds() {
        return this.serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
      this.serviceIds = serviceIds;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public Boolean getSystem() {
        return this.system;
    }

    public void setSystem(Boolean system) {
      this.system = system;
    }
    
    public Map<String, Object> getTemplates() {
        return this.templates;
    }

    public void setTemplates(Map<String, Object> templates) {
      this.templates = templates;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Integer getTransitioningProgress() {
        return this.transitioningProgress;
    }

    public void setTransitioningProgress(Integer transitioningProgress) {
      this.transitioningProgress = transitioningProgress;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
