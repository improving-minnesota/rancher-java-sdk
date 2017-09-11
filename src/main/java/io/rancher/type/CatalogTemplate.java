package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class CatalogTemplate extends AbstractType {
    
    private Map<String, Object> answers;
    
    private Binding binding;
    
    private String description;
    
    private String dockerCompose;
    
    private String name;
    
    private String rancherCompose;
    
    private String templateId;
    
    private String templateVersionId;
    
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getDockerCompose() {
        return this.dockerCompose;
    }

    public void setDockerCompose(String dockerCompose) {
      this.dockerCompose = dockerCompose;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getRancherCompose() {
        return this.rancherCompose;
    }

    public void setRancherCompose(String rancherCompose) {
      this.rancherCompose = rancherCompose;
    }
    
    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
      this.templateId = templateId;
    }
    
    public String getTemplateVersionId() {
        return this.templateVersionId;
    }

    public void setTemplateVersionId(String templateVersionId) {
      this.templateVersionId = templateVersionId;
    }
    
}
