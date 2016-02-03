package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class SetLabelsInput extends AbstractType {
    
    private Map<String, Object> labels;
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
}
