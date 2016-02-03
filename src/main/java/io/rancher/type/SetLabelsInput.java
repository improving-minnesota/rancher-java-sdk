package io.rancher.type;

import io.rancher.base.AbstractType;

public class SetLabelsInput extends AbstractType {
    
    private Object labels;
    
    public Object getLabels() {
        return this.labels;
    }

    public void setLabels(Object labels) {
      this.labels = labels;
    }
    
}
