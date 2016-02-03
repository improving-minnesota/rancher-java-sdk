package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Machine extends AbstractType {
    
    private String accountId;
    
    private Amazonec2Config amazonec2Config;
    
    private String authCertificateAuthority;
    
    private String authKey;
    
    private AzureConfig azureConfig;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private DigitaloceanConfig digitaloceanConfig;
    
    private String dockerVersion;
    
    private String driver;
    
    private Map<String, Object> engineEnv;
    
    private List<String> engineInsecureRegistry;
    
    private String engineInstallUrl;
    
    private Map<String, Object> engineLabel;
    
    private Map<String, Object> engineOpt;
    
    private List<String> engineRegistryMirror;
    
    private String engineStorageDriver;
    
    private ExoscaleConfig exoscaleConfig;
    
    private String externalId;
    
    private String extractedConfig;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private OpenstackConfig openstackConfig;
    
    private PacketConfig packetConfig;
    
    private RackspaceConfig rackspaceConfig;
    
    private String removeTime;
    
    private String removed;
    
    private SoftlayerConfig softlayerConfig;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private UbiquityConfig ubiquityConfig;
    
    private String uuid;
    
    private VirtualboxConfig virtualboxConfig;
    
    private VmwarevcloudairConfig vmwarevcloudairConfig;
    
    private VmwarevsphereConfig vmwarevsphereConfig;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public Amazonec2Config getAmazonec2Config() {
        return this.amazonec2Config;
    }

    public void setAmazonec2Config(Amazonec2Config amazonec2Config) {
      this.amazonec2Config = amazonec2Config;
    }
    
    public String getAuthCertificateAuthority() {
        return this.authCertificateAuthority;
    }

    public void setAuthCertificateAuthority(String authCertificateAuthority) {
      this.authCertificateAuthority = authCertificateAuthority;
    }
    
    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
      this.authKey = authKey;
    }
    
    public AzureConfig getAzureConfig() {
        return this.azureConfig;
    }

    public void setAzureConfig(AzureConfig azureConfig) {
      this.azureConfig = azureConfig;
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
    
    public DigitaloceanConfig getDigitaloceanConfig() {
        return this.digitaloceanConfig;
    }

    public void setDigitaloceanConfig(DigitaloceanConfig digitaloceanConfig) {
      this.digitaloceanConfig = digitaloceanConfig;
    }
    
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
      this.dockerVersion = dockerVersion;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Map<String, Object> getEngineEnv() {
        return this.engineEnv;
    }

    public void setEngineEnv(Map<String, Object> engineEnv) {
      this.engineEnv = engineEnv;
    }
    
    public List<String> getEngineInsecureRegistry() {
        return this.engineInsecureRegistry;
    }

    public void setEngineInsecureRegistry(List<String> engineInsecureRegistry) {
      this.engineInsecureRegistry = engineInsecureRegistry;
    }
    
    public String getEngineInstallUrl() {
        return this.engineInstallUrl;
    }

    public void setEngineInstallUrl(String engineInstallUrl) {
      this.engineInstallUrl = engineInstallUrl;
    }
    
    public Map<String, Object> getEngineLabel() {
        return this.engineLabel;
    }

    public void setEngineLabel(Map<String, Object> engineLabel) {
      this.engineLabel = engineLabel;
    }
    
    public Map<String, Object> getEngineOpt() {
        return this.engineOpt;
    }

    public void setEngineOpt(Map<String, Object> engineOpt) {
      this.engineOpt = engineOpt;
    }
    
    public List<String> getEngineRegistryMirror() {
        return this.engineRegistryMirror;
    }

    public void setEngineRegistryMirror(List<String> engineRegistryMirror) {
      this.engineRegistryMirror = engineRegistryMirror;
    }
    
    public String getEngineStorageDriver() {
        return this.engineStorageDriver;
    }

    public void setEngineStorageDriver(String engineStorageDriver) {
      this.engineStorageDriver = engineStorageDriver;
    }
    
    public ExoscaleConfig getExoscaleConfig() {
        return this.exoscaleConfig;
    }

    public void setExoscaleConfig(ExoscaleConfig exoscaleConfig) {
      this.exoscaleConfig = exoscaleConfig;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getExtractedConfig() {
        return this.extractedConfig;
    }

    public void setExtractedConfig(String extractedConfig) {
      this.extractedConfig = extractedConfig;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public OpenstackConfig getOpenstackConfig() {
        return this.openstackConfig;
    }

    public void setOpenstackConfig(OpenstackConfig openstackConfig) {
      this.openstackConfig = openstackConfig;
    }
    
    public PacketConfig getPacketConfig() {
        return this.packetConfig;
    }

    public void setPacketConfig(PacketConfig packetConfig) {
      this.packetConfig = packetConfig;
    }
    
    public RackspaceConfig getRackspaceConfig() {
        return this.rackspaceConfig;
    }

    public void setRackspaceConfig(RackspaceConfig rackspaceConfig) {
      this.rackspaceConfig = rackspaceConfig;
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
    
    public SoftlayerConfig getSoftlayerConfig() {
        return this.softlayerConfig;
    }

    public void setSoftlayerConfig(SoftlayerConfig softlayerConfig) {
      this.softlayerConfig = softlayerConfig;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
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
    
    public UbiquityConfig getUbiquityConfig() {
        return this.ubiquityConfig;
    }

    public void setUbiquityConfig(UbiquityConfig ubiquityConfig) {
      this.ubiquityConfig = ubiquityConfig;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public VirtualboxConfig getVirtualboxConfig() {
        return this.virtualboxConfig;
    }

    public void setVirtualboxConfig(VirtualboxConfig virtualboxConfig) {
      this.virtualboxConfig = virtualboxConfig;
    }
    
    public VmwarevcloudairConfig getVmwarevcloudairConfig() {
        return this.vmwarevcloudairConfig;
    }

    public void setVmwarevcloudairConfig(VmwarevcloudairConfig vmwarevcloudairConfig) {
      this.vmwarevcloudairConfig = vmwarevcloudairConfig;
    }
    
    public VmwarevsphereConfig getVmwarevsphereConfig() {
        return this.vmwarevsphereConfig;
    }

    public void setVmwarevsphereConfig(VmwarevsphereConfig vmwarevsphereConfig) {
      this.vmwarevsphereConfig = vmwarevsphereConfig;
    }
    
}
