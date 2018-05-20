package io.rancher.type

import io.rancher.base.RancherModel
import io.rancher.base.RancherType

@RancherModel
class Container implements RancherType {
  String accountId
  String agentId
  String allocationState
  BigInteger count
  BigInteger createIndex
  String created
  Map<String, Object> data
  String deploymentUnitUuid
  String description
  List<String> expose
  String externalId
  String firstRunning
  String healthState
  String hostId
  String hostname
  String imageUuid
  String instanceTriggeredStop
  String kind
  BigInteger memoryReservation
  BigInteger milliCpuReservation
  List<MountEntry> mounts
  String name
  Boolean nativeContainer
  String networkContainerId
  List<String> networkIds
  List<String> ports
  String primaryIpAddress
  String registryCredentialId
  String removeTime
  String removed
  String requestedHostId
  String serviceId
  List<String> serviceIds
  String stackId
  BigInteger startCount
  Boolean startOnCreate
  String state
  Boolean system
  String token
  String transitioning
  String transitioningMessage
  BigInteger transitioningProgress
  String uuid
  String version
  String volumeDriver
  Map<String, Object> environment
  List<String> command
  String workingDir
  String user
  Boolean publishAllPorts
  String primaryNetworkId
  Boolean privileged
  List<String> capAdd
  List<String> capDrop
  List<String> dns
  List<String> dnsSearch
  Map<String, Object> instanceLinks
  String domainName
  BigInteger memorySwap
  BigInteger memory
  String cpuSet
  BigInteger cpuShares
  Boolean stdinOpen
  Boolean tty
  List<String> entryPoint
  Map<String, Object> lxcConf
  RestartPolicy restartPolicy
  List<String> devices
  Map<String, Object> blkioDeviceOptions
  Map<String, Object> labels
  InstanceHealthCheck healthCheck
  List<String> securityOpt
  LogConfig logConfig
  String pidMode
  List<String> extraHosts
  Boolean readOnly
  DockerBuild build
  Map<String, Object> dataVolumeMounts
  BigInteger blkioWeight
  String cgroupParent
  String usernsMode
  BigInteger pidsLimit
  BigInteger diskQuota
  BigInteger cpuCount
  BigInteger cpuPercent
  BigInteger ioMaximumIOps
  BigInteger ioMaximumBandwidth
  BigInteger cpuPeriod
  BigInteger cpuQuota
  String cpuSetMems
  BigInteger cpuRealtimePeriod
  BigInteger cpuRealtimeRuntime
  List<String> dnsOpt
  List<String> groupAdd
  String isolation
  BigInteger kernelMemory
  BigInteger memorySwappiness
  Boolean oomKillDisable
  BigInteger shmSize
  Map<String, Object> tmpfs
  String uts
  String ipcMode
  String stopSignal
  BigInteger stopTimeout
  Map<String, Object> sysctls
  Boolean runInit
  Map<String, Object> storageOpt
  BigInteger oomScoreAdj
  List<Ulimit> ulimits
  String ip
  String ip6
  List<String> netAlias
  List<String> healthCmd
  BigInteger healthInterval
  BigInteger healthTimeout
  BigInteger healthRetries
  List<SecretReference> secrets
  List<String> userPorts
  String networkMode
  List<String> dataVolumes
  List<String> dataVolumesFrom
}
