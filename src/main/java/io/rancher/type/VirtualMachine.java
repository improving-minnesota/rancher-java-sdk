package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class VirtualMachine extends AbstractType {
    
    private String accountId;
    
    private String agentId;
    
    private String allocationState;
    
    private Map<String, Object> blkioDeviceOptions;
    
    private Integer blkioWeight;
    
    private String cgroupParent;
    
    private List<String> command;
    
    private Integer count;
    
    private Integer cpuCount;
    
    private Integer cpuPercent;
    
    private Integer cpuPeriod;
    
    private Integer cpuQuota;
    
    private String cpuSet;
    
    private String cpuSetMems;
    
    private Integer cpuShares;
    
    private Integer createIndex;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String deploymentUnitUuid;
    
    private String description;
    
    private Integer diskQuota;
    
    private List<VirtualMachineDisk> disks;
    
    private List<String> dns;
    
    private List<String> dnsOpt;
    
    private List<String> dnsSearch;
    
    private String domainName;
    
    private List<String> expose;
    
    private String externalId;
    
    private List<String> extraHosts;
    
    private String firstRunning;
    
    private List<String> groupAdd;
    
    private InstanceHealthCheck healthCheck;
    
    private List<String> healthCmd;
    
    private Integer healthInterval;
    
    private Integer healthRetries;
    
    private String healthState;
    
    private Integer healthTimeout;
    
    private String hostId;
    
    private String hostname;
    
    private String imageUuid;
    
    private Map<String, Object> instanceLinks;
    
    private String instanceTriggeredStop;
    
    private Integer ioMaximumBandwidth;
    
    private Integer ioMaximumIOps;
    
    private String ip;
    
    private String ip6;
    
    private String ipcMode;
    
    private String isolation;
    
    private Integer kernelMemory;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private LogConfig logConfig;
    
    private Integer memory;
    
    private Integer memoryMb;
    
    private Integer memoryReservation;
    
    private Integer memorySwap;
    
    private Integer memorySwappiness;
    
    private Integer milliCpuReservation;
    
    private List<MountEntry> mounts;
    
    private String name;
    
    private Boolean nativeContainer;
    
    private List<String> netAlias;
    
    private List<String> networkIds;
    
    private String networkMode;
    
    private Boolean oomKillDisable;
    
    private Integer oomScoreAdj;
    
    private Integer pidsLimit;
    
    private List<String> ports;
    
    private String primaryIpAddress;
    
    private String primaryNetworkId;
    
    private String registryCredentialId;
    
    private String removeTime;
    
    private String removed;
    
    private String requestedHostId;
    
    private RestartPolicy restartPolicy;
    
    private Boolean runInit;
    
    private List<String> securityOpt;
    
    private String serviceId;
    
    private List<String> serviceIds;
    
    private Integer shmSize;
    
    private String stackId;
    
    private Integer startCount;
    
    private Boolean startOnCreate;
    
    private String state;
    
    private String stopSignal;
    
    private Map<String, Object> storageOpt;
    
    private Map<String, Object> sysctls;
    
    private Boolean system;
    
    private Map<String, Object> tmpfs;
    
    private String token;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private List<Ulimit> ulimits;
    
    private List<String> userPorts;
    
    private String userdata;
    
    private String usernsMode;
    
    private String uts;
    
    private String uuid;
    
    private Integer vcpu;
    
    private String version;
    
    private String volumeDriver;
    
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
    
    public Map<String, Object> getBlkioDeviceOptions() {
        return this.blkioDeviceOptions;
    }

    public void setBlkioDeviceOptions(Map<String, Object> blkioDeviceOptions) {
      this.blkioDeviceOptions = blkioDeviceOptions;
    }
    
    public Integer getBlkioWeight() {
        return this.blkioWeight;
    }

    public void setBlkioWeight(Integer blkioWeight) {
      this.blkioWeight = blkioWeight;
    }
    
    public String getCgroupParent() {
        return this.cgroupParent;
    }

    public void setCgroupParent(String cgroupParent) {
      this.cgroupParent = cgroupParent;
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
    
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(Integer cpuCount) {
      this.cpuCount = cpuCount;
    }
    
    public Integer getCpuPercent() {
        return this.cpuPercent;
    }

    public void setCpuPercent(Integer cpuPercent) {
      this.cpuPercent = cpuPercent;
    }
    
    public Integer getCpuPeriod() {
        return this.cpuPeriod;
    }

    public void setCpuPeriod(Integer cpuPeriod) {
      this.cpuPeriod = cpuPeriod;
    }
    
    public Integer getCpuQuota() {
        return this.cpuQuota;
    }

    public void setCpuQuota(Integer cpuQuota) {
      this.cpuQuota = cpuQuota;
    }
    
    public String getCpuSet() {
        return this.cpuSet;
    }

    public void setCpuSet(String cpuSet) {
      this.cpuSet = cpuSet;
    }
    
    public String getCpuSetMems() {
        return this.cpuSetMems;
    }

    public void setCpuSetMems(String cpuSetMems) {
      this.cpuSetMems = cpuSetMems;
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
    
    public Integer getDiskQuota() {
        return this.diskQuota;
    }

    public void setDiskQuota(Integer diskQuota) {
      this.diskQuota = diskQuota;
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
    
    public List<String> getDnsOpt() {
        return this.dnsOpt;
    }

    public void setDnsOpt(List<String> dnsOpt) {
      this.dnsOpt = dnsOpt;
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
    
    public List<String> getGroupAdd() {
        return this.groupAdd;
    }

    public void setGroupAdd(List<String> groupAdd) {
      this.groupAdd = groupAdd;
    }
    
    public InstanceHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public void setHealthCheck(InstanceHealthCheck healthCheck) {
      this.healthCheck = healthCheck;
    }
    
    public List<String> getHealthCmd() {
        return this.healthCmd;
    }

    public void setHealthCmd(List<String> healthCmd) {
      this.healthCmd = healthCmd;
    }
    
    public Integer getHealthInterval() {
        return this.healthInterval;
    }

    public void setHealthInterval(Integer healthInterval) {
      this.healthInterval = healthInterval;
    }
    
    public Integer getHealthRetries() {
        return this.healthRetries;
    }

    public void setHealthRetries(Integer healthRetries) {
      this.healthRetries = healthRetries;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public Integer getHealthTimeout() {
        return this.healthTimeout;
    }

    public void setHealthTimeout(Integer healthTimeout) {
      this.healthTimeout = healthTimeout;
    }
    
    public String getHostId() {
        return this.hostId;
    }

    public void setHostId(String hostId) {
      this.hostId = hostId;
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
    
    public String getInstanceTriggeredStop() {
        return this.instanceTriggeredStop;
    }

    public void setInstanceTriggeredStop(String instanceTriggeredStop) {
      this.instanceTriggeredStop = instanceTriggeredStop;
    }
    
    public Integer getIoMaximumBandwidth() {
        return this.ioMaximumBandwidth;
    }

    public void setIoMaximumBandwidth(Integer ioMaximumBandwidth) {
      this.ioMaximumBandwidth = ioMaximumBandwidth;
    }
    
    public Integer getIoMaximumIOps() {
        return this.ioMaximumIOps;
    }

    public void setIoMaximumIOps(Integer ioMaximumIOps) {
      this.ioMaximumIOps = ioMaximumIOps;
    }
    
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
      this.ip = ip;
    }
    
    public String getIp6() {
        return this.ip6;
    }

    public void setIp6(String ip6) {
      this.ip6 = ip6;
    }
    
    public String getIpcMode() {
        return this.ipcMode;
    }

    public void setIpcMode(String ipcMode) {
      this.ipcMode = ipcMode;
    }
    
    public String getIsolation() {
        return this.isolation;
    }

    public void setIsolation(String isolation) {
      this.isolation = isolation;
    }
    
    public Integer getKernelMemory() {
        return this.kernelMemory;
    }

    public void setKernelMemory(Integer kernelMemory) {
      this.kernelMemory = kernelMemory;
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
    
    public Integer getMemoryReservation() {
        return this.memoryReservation;
    }

    public void setMemoryReservation(Integer memoryReservation) {
      this.memoryReservation = memoryReservation;
    }
    
    public Integer getMemorySwap() {
        return this.memorySwap;
    }

    public void setMemorySwap(Integer memorySwap) {
      this.memorySwap = memorySwap;
    }
    
    public Integer getMemorySwappiness() {
        return this.memorySwappiness;
    }

    public void setMemorySwappiness(Integer memorySwappiness) {
      this.memorySwappiness = memorySwappiness;
    }
    
    public Integer getMilliCpuReservation() {
        return this.milliCpuReservation;
    }

    public void setMilliCpuReservation(Integer milliCpuReservation) {
      this.milliCpuReservation = milliCpuReservation;
    }
    
    public List<MountEntry> getMounts() {
        return this.mounts;
    }

    public void setMounts(List<MountEntry> mounts) {
      this.mounts = mounts;
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
    
    public List<String> getNetAlias() {
        return this.netAlias;
    }

    public void setNetAlias(List<String> netAlias) {
      this.netAlias = netAlias;
    }
    
    public List<String> getNetworkIds() {
        return this.networkIds;
    }

    public void setNetworkIds(List<String> networkIds) {
      this.networkIds = networkIds;
    }
    
    public String getNetworkMode() {
        return this.networkMode;
    }

    public void setNetworkMode(String networkMode) {
      this.networkMode = networkMode;
    }
    
    public Boolean getOomKillDisable() {
        return this.oomKillDisable;
    }

    public void setOomKillDisable(Boolean oomKillDisable) {
      this.oomKillDisable = oomKillDisable;
    }
    
    public Integer getOomScoreAdj() {
        return this.oomScoreAdj;
    }

    public void setOomScoreAdj(Integer oomScoreAdj) {
      this.oomScoreAdj = oomScoreAdj;
    }
    
    public Integer getPidsLimit() {
        return this.pidsLimit;
    }

    public void setPidsLimit(Integer pidsLimit) {
      this.pidsLimit = pidsLimit;
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
    
    public String getPrimaryNetworkId() {
        return this.primaryNetworkId;
    }

    public void setPrimaryNetworkId(String primaryNetworkId) {
      this.primaryNetworkId = primaryNetworkId;
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
    
    public RestartPolicy getRestartPolicy() {
        return this.restartPolicy;
    }

    public void setRestartPolicy(RestartPolicy restartPolicy) {
      this.restartPolicy = restartPolicy;
    }
    
    public Boolean getRunInit() {
        return this.runInit;
    }

    public void setRunInit(Boolean runInit) {
      this.runInit = runInit;
    }
    
    public List<String> getSecurityOpt() {
        return this.securityOpt;
    }

    public void setSecurityOpt(List<String> securityOpt) {
      this.securityOpt = securityOpt;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public List<String> getServiceIds() {
        return this.serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
      this.serviceIds = serviceIds;
    }
    
    public Integer getShmSize() {
        return this.shmSize;
    }

    public void setShmSize(Integer shmSize) {
      this.shmSize = shmSize;
    }
    
    public String getStackId() {
        return this.stackId;
    }

    public void setStackId(String stackId) {
      this.stackId = stackId;
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
    
    public String getStopSignal() {
        return this.stopSignal;
    }

    public void setStopSignal(String stopSignal) {
      this.stopSignal = stopSignal;
    }
    
    public Map<String, Object> getStorageOpt() {
        return this.storageOpt;
    }

    public void setStorageOpt(Map<String, Object> storageOpt) {
      this.storageOpt = storageOpt;
    }
    
    public Map<String, Object> getSysctls() {
        return this.sysctls;
    }

    public void setSysctls(Map<String, Object> sysctls) {
      this.sysctls = sysctls;
    }
    
    public Boolean getSystem() {
        return this.system;
    }

    public void setSystem(Boolean system) {
      this.system = system;
    }
    
    public Map<String, Object> getTmpfs() {
        return this.tmpfs;
    }

    public void setTmpfs(Map<String, Object> tmpfs) {
      this.tmpfs = tmpfs;
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
    
    public List<Ulimit> getUlimits() {
        return this.ulimits;
    }

    public void setUlimits(List<Ulimit> ulimits) {
      this.ulimits = ulimits;
    }
    
    public List<String> getUserPorts() {
        return this.userPorts;
    }

    public void setUserPorts(List<String> userPorts) {
      this.userPorts = userPorts;
    }
    
    public String getUserdata() {
        return this.userdata;
    }

    public void setUserdata(String userdata) {
      this.userdata = userdata;
    }
    
    public String getUsernsMode() {
        return this.usernsMode;
    }

    public void setUsernsMode(String usernsMode) {
      this.usernsMode = usernsMode;
    }
    
    public String getUts() {
        return this.uts;
    }

    public void setUts(String uts) {
      this.uts = uts;
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
    
}
