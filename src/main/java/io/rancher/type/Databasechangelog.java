package io.rancher.type;

import io.rancher.base.AbstractType;

public class Databasechangelog extends AbstractType {
    
    private String author;
    
    private String comments;
    
    private String dateexecuted;
    
    private String description;
    
    private String exectype;
    
    private String filename;
    
    private String liquibase;
    
    private String md5sum;
    
    private Integer orderexecuted;
    
    private String tag;
    
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }
    
    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
      this.comments = comments;
    }
    
    public String getDateexecuted() {
        return this.dateexecuted;
    }

    public void setDateexecuted(String dateexecuted) {
      this.dateexecuted = dateexecuted;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getExectype() {
        return this.exectype;
    }

    public void setExectype(String exectype) {
      this.exectype = exectype;
    }
    
    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
      this.filename = filename;
    }
    
    public String getLiquibase() {
        return this.liquibase;
    }

    public void setLiquibase(String liquibase) {
      this.liquibase = liquibase;
    }
    
    public String getMd5sum() {
        return this.md5sum;
    }

    public void setMd5sum(String md5sum) {
      this.md5sum = md5sum;
    }
    
    public Integer getOrderexecuted() {
        return this.orderexecuted;
    }

    public void setOrderexecuted(Integer orderexecuted) {
      this.orderexecuted = orderexecuted;
    }
    
    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
      this.tag = tag;
    }
    
}
