package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class Certificate extends AbstractType {
    
    private String accountId;
    
    private String algorithm;
    
    private String cN;
    
    private String cert;
    
    private String certChain;
    
    private String certFingerprint;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String expiresAt;
    
    private String issuedAt;
    
    private String issuer;
    
    private String key;
    
    private Integer keySize;
    
    private String kind;
    
    private String name;
    
    private String removeTime;
    
    private String removed;
    
    private String serialNumber;
    
    private String state;
    
    private List<String> subjectAlternativeNames;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
    private String version;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(String algorithm) {
      this.algorithm = algorithm;
    }
    
    public String getCN() {
        return this.cN;
    }

    public void setCN(String cN) {
      this.cN = cN;
    }
    
    public String getCert() {
        return this.cert;
    }

    public void setCert(String cert) {
      this.cert = cert;
    }
    
    public String getCertChain() {
        return this.certChain;
    }

    public void setCertChain(String certChain) {
      this.certChain = certChain;
    }
    
    public String getCertFingerprint() {
        return this.certFingerprint;
    }

    public void setCertFingerprint(String certFingerprint) {
      this.certFingerprint = certFingerprint;
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
    
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
    }
    
    public String getIssuedAt() {
        return this.issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
      this.issuedAt = issuedAt;
    }
    
    public String getIssuer() {
        return this.issuer;
    }

    public void setIssuer(String issuer) {
      this.issuer = issuer;
    }
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public Integer getKeySize() {
        return this.keySize;
    }

    public void setKeySize(Integer keySize) {
      this.keySize = keySize;
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
    
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
      this.subjectAlternativeNames = subjectAlternativeNames;
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
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
}
