package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Host extends AbstractType {
    
    private String accountId;
    
    private String agentId;
    
    private String agentIpAddress;
    
    private String agentState;
    
    private Amazonec2Config amazonec2Config;
    
    private String apiProxy;
    
    private String authCertificateAuthority;
    
    private String authKey;
    
    private AzureConfig azureConfig;
    
    private Integer computeTotal;
    
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
    
    private String hostTemplateId;
    
    private String hostname;
    
    private Map<String, Object> info;
    
    private List<String> instanceIds;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private Integer localStorageMb;
    
    private Integer memory;
    
    private Integer milliCpu;
    
    private String name;
    
    private PacketConfig packetConfig;
    
    private String physicalHostId;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removeTime;
    
    private String removed;
    
    private String stackId;
    
    private String state;
    
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
    
    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
      this.agentId = agentId;
    }
    
    public String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public void setAgentIpAddress(String agentIpAddress) {
      this.agentIpAddress = agentIpAddress;
    }
    
    public String getAgentState() {
        return this.agentState;
    }

    public void setAgentState(String agentState) {
      this.agentState = agentState;
    }
    
    public Amazonec2Config getAmazonec2Config() {
        return this.amazonec2Config;
    }

    public void setAmazonec2Config(Amazonec2Config amazonec2Config) {
      this.amazonec2Config = amazonec2Config;
    }
    
    public String getApiProxy() {
        return this.apiProxy;
    }

    public void setApiProxy(String apiProxy) {
      this.apiProxy = apiProxy;
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
    
    public Integer getComputeTotal() {
        return this.computeTotal;
    }

    public void setComputeTotal(Integer computeTotal) {
      this.computeTotal = computeTotal;
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
    
    public String getHostTemplateId() {
        return this.hostTemplateId;
    }

    public void setHostTemplateId(String hostTemplateId) {
      this.hostTemplateId = hostTemplateId;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public Map<String, Object> getInfo() {
        return this.info;
    }

    public void setInfo(Map<String, Object> info) {
      this.info = info;
    }
    
    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
      this.instanceIds = instanceIds;
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
    
    public Integer getLocalStorageMb() {
        return this.localStorageMb;
    }

    public void setLocalStorageMb(Integer localStorageMb) {
      this.localStorageMb = localStorageMb;
    }
    
    public Integer getMemory() {
        return this.memory;
    }

    public void setMemory(Integer memory) {
      this.memory = memory;
    }
    
    public Integer getMilliCpu() {
        return this.milliCpu;
    }

    public void setMilliCpu(Integer milliCpu) {
      this.milliCpu = milliCpu;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public PacketConfig getPacketConfig() {
        return this.packetConfig;
    }

    public void setPacketConfig(PacketConfig packetConfig) {
      this.packetConfig = packetConfig;
    }
    
    public String getPhysicalHostId() {
        return this.physicalHostId;
    }

    public void setPhysicalHostId(String physicalHostId) {
      this.physicalHostId = physicalHostId;
    }
    
    public List<PublicEndpoint> getPublicEndpoints() {
        return this.publicEndpoints;
    }

    public void setPublicEndpoints(List<PublicEndpoint> publicEndpoints) {
      this.publicEndpoints = publicEndpoints;
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
    
    public String getStackId() {
        return this.stackId;
    }

    public void setStackId(String stackId) {
      this.stackId = stackId;
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
