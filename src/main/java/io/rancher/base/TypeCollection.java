package io.rancher.base;

import java.util.List;

public class TypeCollection<T> {

    private List<T> data;

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
