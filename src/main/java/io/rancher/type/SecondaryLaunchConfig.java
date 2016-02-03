package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class SecondaryLaunchConfig extends AbstractType {
    
    private String accountId;
    
    private String agentId;
    
    private String allocationState;
    
    private DockerBuild build;
    
    private List<String> capAdd;
    
    private List<String> capDrop;
    
    private List<String> command;
    
    private Integer count;
    
    private String cpuSet;
    
    private Integer cpuShares;
    
    private Integer createIndex;
    
    private String created;
    
    private Map<String, Object> data;
    
    private Map<String, Object> dataVolumeMounts;
    
    private List<String> dataVolumes;
    
    private List<String> dataVolumesFrom;
    
    private List<String> dataVolumesFromLaunchConfigs;
    
    private String deploymentUnitUuid;
    
    private String description;
    
    private List<String> devices;
    
    private List<VirtualMachineDisk> disks;
    
    private List<String> dns;
    
    private List<String> dnsSearch;
    
    private String domainName;
    
    private List<String> entryPoint;
    
    private Map<String, Object> environment;
    
    private List<String> expose;
    
    private String externalId;
    
    private List<String> extraHosts;
    
    private String firstRunning;
    
    private InstanceHealthCheck healthCheck;
    
    private String healthState;
    
    private String hostname;
    
    private String imageUuid;
    
    private Map<String, Object> instanceLinks;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private LogConfig logConfig;
    
    private Map<String, Object> lxcConf;
    
    private Integer memory;
    
    private Integer memoryMb;
    
    private Integer memorySwap;
    
    private String name;
    
    private Boolean nativeContainer;
    
    private String networkContainerId;
    
    private List<String> networkIds;
    
    private String networkLaunchConfig;
    
    private String networkMode;
    
    private String pidMode;
    
    private List<String> ports;
    
    private String primaryIpAddress;
    
    private Boolean privileged;
    
    private Boolean publishAllPorts;
    
    private Boolean readOnly;
    
    private String registryCredentialId;
    
    private String removeTime;
    
    private String removed;
    
    private String requestedHostId;
    
    private List<String> securityOpt;
    
    private Integer startCount;
    
    private Boolean startOnCreate;
    
    private String state;
    
    private Boolean stdinOpen;
    
    private String systemContainer;
    
    private String token;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private Boolean tty;
    
    private String user;
    
    private String userdata;
    
    private String uuid;
    
    private Integer vcpu;
    
    private String version;
    
    private String volumeDriver;
    
    private String workingDir;
    
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
    
    public String getAllocationState() {
        return this.allocationState;
    }

    public void setAllocationState(String allocationState) {
      this.allocationState = allocationState;
    }
    
    public DockerBuild getBuild() {
        return this.build;
    }

    public void setBuild(DockerBuild build) {
      this.build = build;
    }
    
    public List<String> getCapAdd() {
        return this.capAdd;
    }

    public void setCapAdd(List<String> capAdd) {
      this.capAdd = capAdd;
    }
    
    public List<String> getCapDrop() {
        return this.capDrop;
    }

    public void setCapDrop(List<String> capDrop) {
      this.capDrop = capDrop;
    }
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }
    
    public String getCpuSet() {
        return this.cpuSet;
    }

    public void setCpuSet(String cpuSet) {
      this.cpuSet = cpuSet;
    }
    
    public Integer getCpuShares() {
        return this.cpuShares;
    }

    public void setCpuShares(Integer cpuShares) {
      this.cpuShares = cpuShares;
    }
    
    public Integer getCreateIndex() {
        return this.createIndex;
    }

    public void setCreateIndex(Integer createIndex) {
      this.createIndex = createIndex;
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
    
    public Map<String, Object> getDataVolumeMounts() {
        return this.dataVolumeMounts;
    }

    public void setDataVolumeMounts(Map<String, Object> dataVolumeMounts) {
      this.dataVolumeMounts = dataVolumeMounts;
    }
    
    public List<String> getDataVolumes() {
        return this.dataVolumes;
    }

    public void setDataVolumes(List<String> dataVolumes) {
      this.dataVolumes = dataVolumes;
    }
    
    public List<String> getDataVolumesFrom() {
        return this.dataVolumesFrom;
    }

    public void setDataVolumesFrom(List<String> dataVolumesFrom) {
      this.dataVolumesFrom = dataVolumesFrom;
    }
    
    public List<String> getDataVolumesFromLaunchConfigs() {
        return this.dataVolumesFromLaunchConfigs;
    }

    public void setDataVolumesFromLaunchConfigs(List<String> dataVolumesFromLaunchConfigs) {
      this.dataVolumesFromLaunchConfigs = dataVolumesFromLaunchConfigs;
    }
    
    public String getDeploymentUnitUuid() {
        return this.deploymentUnitUuid;
    }

    public void setDeploymentUnitUuid(String deploymentUnitUuid) {
      this.deploymentUnitUuid = deploymentUnitUuid;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public List<String> getDevices() {
        return this.devices;
    }

    public void setDevices(List<String> devices) {
      this.devices = devices;
    }
    
    public List<VirtualMachineDisk> getDisks() {
        return this.disks;
    }

    public void setDisks(List<VirtualMachineDisk> disks) {
      this.disks = disks;
    }
    
    public List<String> getDns() {
        return this.dns;
    }

    public void setDns(List<String> dns) {
      this.dns = dns;
    }
    
    public List<String> getDnsSearch() {
        return this.dnsSearch;
    }

    public void setDnsSearch(List<String> dnsSearch) {
      this.dnsSearch = dnsSearch;
    }
    
    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
      this.domainName = domainName;
    }
    
    public List<String> getEntryPoint() {
        return this.entryPoint;
    }

    public void setEntryPoint(List<String> entryPoint) {
      this.entryPoint = entryPoint;
    }
    
    public Map<String, Object> getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Map<String, Object> environment) {
      this.environment = environment;
    }
    
    public List<String> getExpose() {
        return this.expose;
    }

    public void setExpose(List<String> expose) {
      this.expose = expose;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public List<String> getExtraHosts() {
        return this.extraHosts;
    }

    public void setExtraHosts(List<String> extraHosts) {
      this.extraHosts = extraHosts;
    }
    
    public String getFirstRunning() {
        return this.firstRunning;
    }

    public void setFirstRunning(String firstRunning) {
      this.firstRunning = firstRunning;
    }
    
    public InstanceHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public void setHealthCheck(InstanceHealthCheck healthCheck) {
      this.healthCheck = healthCheck;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getImageUuid() {
        return this.imageUuid;
    }

    public void setImageUuid(String imageUuid) {
      this.imageUuid = imageUuid;
    }
    
    public Map<String, Object> getInstanceLinks() {
        return this.instanceLinks;
    }

    public void setInstanceLinks(Map<String, Object> instanceLinks) {
      this.instanceLinks = instanceLinks;
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
    
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public void setLogConfig(LogConfig logConfig) {
      this.logConfig = logConfig;
    }
    
    public Map<String, Object> getLxcConf() {
        return this.lxcConf;
    }

    public void setLxcConf(Map<String, Object> lxcConf) {
      this.lxcConf = lxcConf;
    }
    
    public Integer getMemory() {
        return this.memory;
    }

    public void setMemory(Integer memory) {
      this.memory = memory;
    }
    
    public Integer getMemoryMb() {
        return this.memoryMb;
    }

    public void setMemoryMb(Integer memoryMb) {
      this.memoryMb = memoryMb;
    }
    
    public Integer getMemorySwap() {
        return this.memorySwap;
    }

    public void setMemorySwap(Integer memorySwap) {
      this.memorySwap = memorySwap;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getNativeContainer() {
        return this.nativeContainer;
    }

    public void setNativeContainer(Boolean nativeContainer) {
      this.nativeContainer = nativeContainer;
    }
    
    public String getNetworkContainerId() {
        return this.networkContainerId;
    }

    public void setNetworkContainerId(String networkContainerId) {
      this.networkContainerId = networkContainerId;
    }
    
    public List<String> getNetworkIds() {
        return this.networkIds;
    }

    public void setNetworkIds(List<String> networkIds) {
      this.networkIds = networkIds;
    }
    
    public String getNetworkLaunchConfig() {
        return this.networkLaunchConfig;
    }

    public void setNetworkLaunchConfig(String networkLaunchConfig) {
      this.networkLaunchConfig = networkLaunchConfig;
    }
    
    public String getNetworkMode() {
        return this.networkMode;
    }

    public void setNetworkMode(String networkMode) {
      this.networkMode = networkMode;
    }
    
    public String getPidMode() {
        return this.pidMode;
    }

    public void setPidMode(String pidMode) {
      this.pidMode = pidMode;
    }
    
    public List<String> getPorts() {
        return this.ports;
    }

    public void setPorts(List<String> ports) {
      this.ports = ports;
    }
    
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public void setPrimaryIpAddress(String primaryIpAddress) {
      this.primaryIpAddress = primaryIpAddress;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public Boolean getPublishAllPorts() {
        return this.publishAllPorts;
    }

    public void setPublishAllPorts(Boolean publishAllPorts) {
      this.publishAllPorts = publishAllPorts;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getRegistryCredentialId() {
        return this.registryCredentialId;
    }

    public void setRegistryCredentialId(String registryCredentialId) {
      this.registryCredentialId = registryCredentialId;
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
    
    public String getRequestedHostId() {
        return this.requestedHostId;
    }

    public void setRequestedHostId(String requestedHostId) {
      this.requestedHostId = requestedHostId;
    }
    
    public List<String> getSecurityOpt() {
        return this.securityOpt;
    }

    public void setSecurityOpt(List<String> securityOpt) {
      this.securityOpt = securityOpt;
    }
    
    public Integer getStartCount() {
        return this.startCount;
    }

    public void setStartCount(Integer startCount) {
      this.startCount = startCount;
    }
    
    public Boolean getStartOnCreate() {
        return this.startOnCreate;
    }

    public void setStartOnCreate(Boolean startOnCreate) {
      this.startOnCreate = startOnCreate;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public Boolean getStdinOpen() {
        return this.stdinOpen;
    }

    public void setStdinOpen(Boolean stdinOpen) {
      this.stdinOpen = stdinOpen;
    }
    
    public String getSystemContainer() {
        return this.systemContainer;
    }

    public void setSystemContainer(String systemContainer) {
      this.systemContainer = systemContainer;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
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
    
    public Boolean getTty() {
        return this.tty;
    }

    public void setTty(Boolean tty) {
      this.tty = tty;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
    public String getUserdata() {
        return this.userdata;
    }

    public void setUserdata(String userdata) {
      this.userdata = userdata;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Integer getVcpu() {
        return this.vcpu;
    }

    public void setVcpu(Integer vcpu) {
      this.vcpu = vcpu;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
    public String getVolumeDriver() {
        return this.volumeDriver;
    }

    public void setVolumeDriver(String volumeDriver) {
      this.volumeDriver = volumeDriver;
    }
    
    public String getWorkingDir() {
        return this.workingDir;
    }

    public void setWorkingDir(String workingDir) {
      this.workingDir = workingDir;
    }
    
}
