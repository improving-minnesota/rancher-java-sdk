package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Container extends RancherType { 
  String accountId
  String agentId
  String allocationState
  Map<String, Object> blkioDeviceOptions
  BigInteger blkioWeight
  DockerBuild build
  List<String> capAdd
  List<String> capDrop
  String cgroupParent
  List<String> command
  BigInteger count
  BigInteger cpuCount
  BigInteger cpuPercent
  BigInteger cpuPeriod
  BigInteger cpuQuota
  BigInteger cpuRealtimePeriod
  BigInteger cpuRealtimeRuntime
  String cpuSet
  String cpuSetMems
  BigInteger cpuShares
  BigInteger createIndex
  String created
  Map<String, Object> data
  Map<String, Object> dataVolumeMounts
  List<String> dataVolumes
  List<String> dataVolumesFrom
  String deploymentUnitUuid
  String description
  List<String> devices
  BigInteger diskQuota
  List<String> dns
  List<String> dnsOpt
  List<String> dnsSearch
  String domainName
  List<String> entryPoint
  Map<String, Object> environment
  List<String> expose
  String externalId
  List<String> extraHosts
  String firstRunning
  List<String> groupAdd
  InstanceHealthCheck healthCheck
  List<String> healthCmd
  BigInteger healthInterval
  BigInteger healthRetries
  String healthState
  BigInteger healthTimeout
  String hostId
  String hostname
  String imageUuid
  Map<String, Object> instanceLinks
  String instanceTriggeredStop
  BigInteger ioMaximumBandwidth
  BigInteger ioMaximumIOps
  String ip
  String ip6
  String ipcMode
  String isolation
  BigInteger kernelMemory
  String kind
  Map<String, Object> labels
  LogConfig logConfig
  Map<String, Object> lxcConf
  BigInteger memory
  BigInteger memoryReservation
  BigInteger memorySwap
  BigInteger memorySwappiness
  BigInteger milliCpuReservation
  List<MountEntry> mounts
  String name
  Boolean nativeContainer
  List<String> netAlias
  String networkContainerId
  List<String> networkIds
  String networkMode
  Boolean oomKillDisable
  BigInteger oomScoreAdj
  String pidMode
  BigInteger pidsLimit
  List<String> ports
  String primaryIpAddress
  String primaryNetworkId
  Boolean privileged
  Boolean publishAllPorts
  Boolean readOnly
  String registryCredentialId
  String removeTime
  String removed
  String requestedHostId
  RestartPolicy restartPolicy
  Boolean runInit
  List<SecretReference> secrets
  List<String> securityOpt
  String serviceId
  List<String> serviceIds
  BigInteger shmSize
  String stackId
  BigInteger startCount
  Boolean startOnCreate
  String state
  Boolean stdinOpen
  String stopSignal
  BigInteger stopTimeout
  Map<String, Object> storageOpt
  Map<String, Object> sysctls
  Boolean system
  Map<String, Object> tmpfs
  String token
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  Boolean tty
  List<Ulimit> ulimits
  String user
  List<String> userPorts
  String usernsMode
  String uts
  String uuid
  String version
  String volumeDriver
  String workingDir
}
