package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class KubernetesStackUpgrade extends AbstractType {
    
    private Map<String, Object> answers;
    
    private Map<String, Object> environment;
    
    private String externalId;
    
    private Map<String, Object> templates;
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
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
    
    public Map<String, Object> getTemplates() {
        return this.templates;
    }

    public void setTemplates(Map<String, Object> templates) {
      this.templates = templates;
    }
    
}
