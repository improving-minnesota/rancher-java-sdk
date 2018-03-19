package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProjectApi {
  @GET('projects')
  Call<TypeCollection<Project>> list()

  @GET('projects')
  Call<TypeCollection<Project>> query(@QueryMap Map<String, String> filters)

  @POST('projects')
  Call<Project> create(@Body Project project)

  @GET('projects/{id}')
  Call<Project> findById(@Path('id') String id)

  @PUT('projects/{id}')
  Call<Project> update(@Path('id') String id, @Body Project project)

  @DELETE('projects/{id}')
  Call<Project> delete(@Path('id') String id)

  @POST('projects/{id}?action=upgrade')
  Call<Account> upgrade(@Path('id') String id)

  @POST('projects/{id}?action=activate')
  Call<Account> activate(@Path('id') String id)

  @POST('projects/{id}?action=purge')
  Call<Account> purge(@Path('id') String id)

  @POST('projects/{id}?action=remove')
  Call<Account> remove(@Path('id') String id)

  @POST('projects/{id}?action=deactivate')
  Call<Account> deactivate(@Path('id') String id)

  @POST('projects/{id}?action=setmembers')
  Call<SetProjectMembersInput> setmembers(@Path('id') String id, @Body SetProjectMembersInput setProjectMembersInput)

  @GET('projects/{projectId}/account')
  Call<TypeCollection<Account>> listaccounts(@Path('projectId') String projectId)

  @GET('projects/{projectId}/account')
  Call<TypeCollection<Account>> queryaccounts(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/account/{id}')
  Call<Account> findAccountById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/account/{id}?action=upgrade')
  Call<Account> upgradeAccount(@Path('id') String id)

  @POST('projects/{projectId}/account/{id}?action=activate')
  Call<Account> activateAccount(@Path('id') String id)

  @POST('projects/{projectId}/account/{id}?action=purge')
  Call<Account> purgeAccount(@Path('id') String id)

  @POST('projects/{projectId}/account/{id}?action=remove')
  Call<Account> removeAccount(@Path('id') String id)

  @POST('projects/{projectId}/account/{id}?action=deactivate')
  Call<Account> deactivateAccount(@Path('id') String id)

  @GET('projects/{projectId}/activeSetting/{id}')
  Call<ActiveSetting> findActiveSettingById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/addOutputsInput/{id}')
  Call<AddOutputsInput> findAddOutputsInputById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/addRemoveServiceLinkInput')
  Call<AddRemoveServiceLinkInput> createAddRemoveServiceLinkInput(
    @Path('projectId') String projectId, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @GET('projects/{projectId}/addRemoveServiceLinkInput/{id}')
  Call<AddRemoveServiceLinkInput> findAddRemoveServiceLinkInputById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/amazonec2Config')
  Call<Amazonec2Config> createAmazonec2Config(@Path('projectId') String projectId, @Body Amazonec2Config amazonec2Config)

  @GET('projects/{projectId}/amazonec2Config/{id}')
  Call<Amazonec2Config> findAmazonec2ConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/apiKey')
  Call<TypeCollection<ApiKey>> listapiKeys(@Path('projectId') String projectId)

  @GET('projects/{projectId}/apiKey')
  Call<TypeCollection<ApiKey>> queryapiKeys(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/apiKey')
  Call<ApiKey> createApiKey(@Path('projectId') String projectId, @Body ApiKey apiKey)

  @GET('projects/{projectId}/apiKey/{id}')
  Call<ApiKey> findApiKeyById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/apiKey/{id}')
  Call<ApiKey> updateApiKey(@Path('projectId') String projectId, @Path('id') String id, @Body ApiKey apiKey)

  @DELETE('projects/{projectId}/apiKey/{id}')
  Call<ApiKey> deleteApiKey(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/apiKey/{id}?action=activate')
  Call<Credential> activateApiKey(@Path('id') String id)

  @POST('projects/{projectId}/apiKey/{id}?action=purge')
  Call<Credential> purgeApiKey(@Path('id') String id)

  @POST('projects/{projectId}/apiKey/{id}?action=remove')
  Call<Credential> removeApiKey(@Path('id') String id)

  @POST('projects/{projectId}/apiKey/{id}?action=deactivate')
  Call<Credential> deactivateApiKey(@Path('id') String id)

  @GET('projects/{projectId}/auditLog')
  Call<TypeCollection<AuditLog>> listauditLogs(@Path('projectId') String projectId)

  @GET('projects/{projectId}/auditLog')
  Call<TypeCollection<AuditLog>> queryauditLogs(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/auditLog/{id}')
  Call<AuditLog> findAuditLogById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/azureConfig')
  Call<AzureConfig> createAzureConfig(@Path('projectId') String projectId, @Body AzureConfig azureConfig)

  @GET('projects/{projectId}/azureConfig/{id}')
  Call<AzureConfig> findAzureConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/backup')
  Call<TypeCollection<Backup>> listbackups(@Path('projectId') String projectId)

  @GET('projects/{projectId}/backup')
  Call<TypeCollection<Backup>> querybackups(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/backup/{id}')
  Call<Backup> findBackupById(@Path('projectId') String projectId, @Path('id') String id)

  @DELETE('projects/{projectId}/backup/{id}')
  Call<Backup> deleteBackup(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/backup/{id}?action=remove')
  Call<Backup> removeBackup(@Path('id') String id)

  @GET('projects/{projectId}/backupTarget')
  Call<TypeCollection<BackupTarget>> listbackupTargets(@Path('projectId') String projectId)

  @GET('projects/{projectId}/backupTarget')
  Call<TypeCollection<BackupTarget>> querybackupTargets(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/backupTarget')
  Call<BackupTarget> createBackupTarget(@Path('projectId') String projectId, @Body BackupTarget backupTarget)

  @GET('projects/{projectId}/backupTarget/{id}')
  Call<BackupTarget> findBackupTargetById(@Path('projectId') String projectId, @Path('id') String id)

  @DELETE('projects/{projectId}/backupTarget/{id}')
  Call<BackupTarget> deleteBackupTarget(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/backupTarget/{id}?action=remove')
  Call<BackupTarget> removeBackupTarget(@Path('id') String id)

  @GET('projects/{projectId}/baseMachineConfig/{id}')
  Call<BaseMachineConfig> findBaseMachineConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/binding')
  Call<Binding> createBinding(@Path('projectId') String projectId, @Body Binding binding)

  @GET('projects/{projectId}/binding/{id}')
  Call<Binding> findBindingById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/binding/{id}')
  Call<Binding> updateBinding(@Path('projectId') String projectId, @Path('id') String id, @Body Binding binding)

  @POST('projects/{projectId}/blkioDeviceOption')
  Call<BlkioDeviceOption> createBlkioDeviceOption(@Path('projectId') String projectId, @Body BlkioDeviceOption blkioDeviceOption)

  @GET('projects/{projectId}/blkioDeviceOption/{id}')
  Call<BlkioDeviceOption> findBlkioDeviceOptionById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/catalogTemplate/{id}')
  Call<CatalogTemplate> findCatalogTemplateById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/certificate')
  Call<TypeCollection<Certificate>> listcertificates(@Path('projectId') String projectId)

  @GET('projects/{projectId}/certificate')
  Call<TypeCollection<Certificate>> querycertificates(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/certificate')
  Call<Certificate> createCertificate(@Path('projectId') String projectId, @Body Certificate certificate)

  @GET('projects/{projectId}/certificate/{id}')
  Call<Certificate> findCertificateById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/certificate/{id}')
  Call<Certificate> updateCertificate(@Path('projectId') String projectId, @Path('id') String id, @Body Certificate certificate)

  @DELETE('projects/{projectId}/certificate/{id}')
  Call<Certificate> deleteCertificate(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/certificate/{id}?action=remove')
  Call<Certificate> removeCertificate(@Path('id') String id)

  @POST('projects/{projectId}/changeSecretInput')
  Call<ChangeSecretInput> createChangeSecretInput(@Path('projectId') String projectId, @Body ChangeSecretInput changeSecretInput)

  @GET('projects/{projectId}/changeSecretInput/{id}')
  Call<ChangeSecretInput> findChangeSecretInputById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/composeConfig/{id}')
  Call<ComposeConfig> findComposeConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/composeConfigInput')
  Call<ComposeConfigInput> createComposeConfigInput(@Path('projectId') String projectId, @Body ComposeConfigInput composeConfigInput)

  @GET('projects/{projectId}/composeConfigInput/{id}')
  Call<ComposeConfigInput> findComposeConfigInputById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/composeProject')
  Call<TypeCollection<ComposeProject>> listcomposeProjects(@Path('projectId') String projectId)

  @GET('projects/{projectId}/composeProject')
  Call<TypeCollection<ComposeProject>> querycomposeProjects(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/composeProject')
  Call<ComposeProject> createComposeProject(@Path('projectId') String projectId, @Body ComposeProject composeProject)

  @GET('projects/{projectId}/composeProject/{id}')
  Call<ComposeProject> findComposeProjectById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/composeProject/{id}')
  Call<ComposeProject> updateComposeProject(@Path('projectId') String projectId, @Path('id') String id, @Body ComposeProject composeProject)

  @DELETE('projects/{projectId}/composeProject/{id}')
  Call<ComposeProject> deleteComposeProject(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/composeProject/{id}?action=rollback')
  Call<Stack> rollbackComposeProject(@Path('id') String id)

  @POST('projects/{projectId}/composeProject/{id}?action=error')
  Call<Stack> errorComposeProject(@Path('id') String id)

  @POST('projects/{projectId}/composeProject/{id}?action=cancelupgrade')
  Call<Stack> cancelupgradeComposeProject(@Path('id') String id)

  @POST('projects/{projectId}/composeProject/{id}?action=remove')
  Call<Stack> removeComposeProject(@Path('id') String id)

  @POST('projects/{projectId}/composeProject/{id}?action=finishupgrade')
  Call<Stack> finishupgradeComposeProject(@Path('id') String id)

  @GET('projects/{projectId}/composeService')
  Call<TypeCollection<ComposeService>> listcomposeServices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/composeService')
  Call<TypeCollection<ComposeService>> querycomposeServices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/composeService/{id}')
  Call<ComposeService> findComposeServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @DELETE('projects/{projectId}/composeService/{id}')
  Call<ComposeService> deleteComposeService(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/composeService/{id}?action=rollback')
  Call<Service> rollbackComposeService(@Path('id') String id)

  @POST('projects/{projectId}/composeService/{id}?action=remove')
  Call<Service> removeComposeService(@Path('id') String id)

  @POST('projects/{projectId}/composeService/{id}?action=finishupgrade')
  Call<Service> finishupgradeComposeService(@Path('id') String id)

  @POST('projects/{projectId}/composeService/{id}?action=continueupgrade')
  Call<Service> continueupgradeComposeService(@Path('id') String id)

  @POST('projects/{projectId}/composeService/{id}?action=activate')
  Call<Service> activateComposeService(@Path('id') String id)

  @POST('projects/{projectId}/composeService/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeComposeService(@Path('id') String id)

  @GET('projects/{projectId}/container')
  Call<TypeCollection<Container>> listcontainers(@Path('projectId') String projectId)

  @GET('projects/{projectId}/container')
  Call<TypeCollection<Container>> querycontainers(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/container')
  Call<Container> createContainer(@Path('projectId') String projectId, @Body Container container)

  @GET('projects/{projectId}/container/{id}')
  Call<Container> findContainerById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/container/{id}')
  Call<Container> updateContainer(@Path('projectId') String projectId, @Path('id') String id, @Body Container container)

  @DELETE('projects/{projectId}/container/{id}')
  Call<Container> deleteContainer(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=updateunhealthy')
  Call<Instance> updateunhealthyContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=console')
  Call<InstanceConsole> consoleContainer(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST('projects/{projectId}/container/{id}?action=restart')
  Call<Instance> restartContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=deallocate')
  Call<Instance> deallocateContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=start')
  Call<Instance> startContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=updatereinitializing')
  Call<Instance> updatereinitializingContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=purge')
  Call<Instance> purgeContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=error')
  Call<Instance> errorContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=remove')
  Call<Instance> removeContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=stop')
  Call<Instance> stopContainer(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceStop instanceStop)

  @POST('projects/{projectId}/container/{id}?action=allocate')
  Call<Instance> allocateContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=updatehealthy')
  Call<Instance> updatehealthyContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=migrate')
  Call<Instance> migrateContainer(@Path('id') String id)

  @POST('projects/{projectId}/container/{id}?action=logs')
  Call<HostAccess> logsContainer(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerLogs containerLogs)

  @POST('projects/{projectId}/container/{id}?action=execute')
  Call<HostAccess> executeContainer(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerExec containerExec)

  @POST('projects/{projectId}/container/{id}?action=proxy')
  Call<HostAccess> proxyContainer(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerProxy containerProxy)

  @GET('projects/{projectId}/containerEvent')
  Call<TypeCollection<ContainerEvent>> listcontainerEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/containerEvent')
  Call<TypeCollection<ContainerEvent>> querycontainerEvents(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/containerEvent/{id}')
  Call<ContainerEvent> findContainerEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/containerEvent/{id}?action=remove')
  Call<ContainerEvent> removeContainerEvent(@Path('id') String id)

  @POST('projects/{projectId}/containerExec')
  Call<ContainerExec> createContainerExec(@Path('projectId') String projectId, @Body ContainerExec containerExec)

  @GET('projects/{projectId}/containerExec/{id}')
  Call<ContainerExec> findContainerExecById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/containerLogs')
  Call<ContainerLogs> createContainerLogs(@Path('projectId') String projectId, @Body ContainerLogs containerLogs)

  @GET('projects/{projectId}/containerLogs/{id}')
  Call<ContainerLogs> findContainerLogsById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/containerProxy')
  Call<ContainerProxy> createContainerProxy(@Path('projectId') String projectId, @Body ContainerProxy containerProxy)

  @GET('projects/{projectId}/containerProxy/{id}')
  Call<ContainerProxy> findContainerProxyById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/credential')
  Call<TypeCollection<Credential>> listcredentials(@Path('projectId') String projectId)

  @GET('projects/{projectId}/credential')
  Call<TypeCollection<Credential>> querycredentials(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/credential/{id}')
  Call<Credential> findCredentialById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/credential/{id}?action=activate')
  Call<Credential> activateCredential(@Path('id') String id)

  @POST('projects/{projectId}/credential/{id}?action=purge')
  Call<Credential> purgeCredential(@Path('id') String id)

  @POST('projects/{projectId}/credential/{id}?action=remove')
  Call<Credential> removeCredential(@Path('id') String id)

  @POST('projects/{projectId}/credential/{id}?action=deactivate')
  Call<Credential> deactivateCredential(@Path('id') String id)

  @GET('projects/{projectId}/defaultNetwork/{id}')
  Call<DefaultNetwork> findDefaultNetworkById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/defaultNetwork/{id}?action=activate')
  Call<Network> activateDefaultNetwork(@Path('id') String id)

  @POST('projects/{projectId}/defaultNetwork/{id}?action=purge')
  Call<Network> purgeDefaultNetwork(@Path('id') String id)

  @POST('projects/{projectId}/defaultNetwork/{id}?action=remove')
  Call<Network> removeDefaultNetwork(@Path('id') String id)

  @POST('projects/{projectId}/defaultNetwork/{id}?action=deactivate')
  Call<Network> deactivateDefaultNetwork(@Path('id') String id)

  @POST('projects/{projectId}/digitaloceanConfig')
  Call<DigitaloceanConfig> createDigitaloceanConfig(@Path('projectId') String projectId, @Body DigitaloceanConfig digitaloceanConfig)

  @GET('projects/{projectId}/digitaloceanConfig/{id}')
  Call<DigitaloceanConfig> findDigitaloceanConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/dnsService')
  Call<TypeCollection<DnsService>> listdnsServices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/dnsService')
  Call<TypeCollection<DnsService>> querydnsServices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/dnsService')
  Call<DnsService> createDnsService(@Path('projectId') String projectId, @Body DnsService dnsService)

  @GET('projects/{projectId}/dnsService/{id}')
  Call<DnsService> findDnsServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/dnsService/{id}')
  Call<DnsService> updateDnsService(@Path('projectId') String projectId, @Path('id') String id, @Body DnsService dnsService)

  @DELETE('projects/{projectId}/dnsService/{id}')
  Call<DnsService> deleteDnsService(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=rollback')
  Call<Service> rollbackDnsService(@Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=upgrade')
  Call<Service> upgradeDnsService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceUpgrade serviceUpgrade)

  @POST('projects/{projectId}/dnsService/{id}?action=restart')
  Call<Service> restartDnsService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceRestart serviceRestart)

  @POST('projects/{projectId}/dnsService/{id}?action=remove')
  Call<Service> removeDnsService(@Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=deactivate')
  Call<Service> deactivateDnsService(@Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=finishupgrade')
  Call<Service> finishupgradeDnsService(@Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=removeservicelink')
  Call<Service> removeservicelinkDnsService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/dnsService/{id}?action=continueupgrade')
  Call<Service> continueupgradeDnsService(@Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=activate')
  Call<Service> activateDnsService(@Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=addservicelink')
  Call<Service> addservicelinkDnsService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/dnsService/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeDnsService(@Path('id') String id)

  @POST('projects/{projectId}/dnsService/{id}?action=setservicelinks')
  Call<Service> setservicelinksDnsService(@Path('projectId') String projectId, @Path('id') String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST('projects/{projectId}/dockerBuild')
  Call<DockerBuild> createDockerBuild(@Path('projectId') String projectId, @Body DockerBuild dockerBuild)

  @GET('projects/{projectId}/dockerBuild/{id}')
  Call<DockerBuild> findDockerBuildById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/externalDnsEvent')
  Call<TypeCollection<ExternalDnsEvent>> listexternalDnsEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/externalDnsEvent')
  Call<TypeCollection<ExternalDnsEvent>> queryexternalDnsEvents(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/externalDnsEvent/{id}')
  Call<ExternalDnsEvent> findExternalDnsEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/externalDnsEvent/{id}?action=remove')
  Call<ExternalEvent> removeExternalDnsEvent(@Path('id') String id)

  @GET('projects/{projectId}/externalEvent')
  Call<TypeCollection<ExternalEvent>> listexternalEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/externalEvent')
  Call<TypeCollection<ExternalEvent>> queryexternalEvents(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/externalEvent/{id}')
  Call<ExternalEvent> findExternalEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/externalEvent/{id}?action=remove')
  Call<ExternalEvent> removeExternalEvent(@Path('id') String id)

  @GET('projects/{projectId}/externalHostEvent')
  Call<TypeCollection<ExternalHostEvent>> listexternalHostEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/externalHostEvent')
  Call<TypeCollection<ExternalHostEvent>> queryexternalHostEvents(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/externalHostEvent')
  Call<ExternalHostEvent> createExternalHostEvent(@Path('projectId') String projectId, @Body ExternalHostEvent externalHostEvent)

  @GET('projects/{projectId}/externalHostEvent/{id}')
  Call<ExternalHostEvent> findExternalHostEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/externalHostEvent/{id}?action=remove')
  Call<ExternalEvent> removeExternalHostEvent(@Path('id') String id)

  @GET('projects/{projectId}/externalService')
  Call<TypeCollection<ExternalService>> listexternalServices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/externalService')
  Call<TypeCollection<ExternalService>> queryexternalServices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/externalService')
  Call<ExternalService> createExternalService(@Path('projectId') String projectId, @Body ExternalService externalService)

  @GET('projects/{projectId}/externalService/{id}')
  Call<ExternalService> findExternalServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/externalService/{id}')
  Call<ExternalService> updateExternalService(@Path('projectId') String projectId, @Path('id') String id, @Body ExternalService externalService)

  @DELETE('projects/{projectId}/externalService/{id}')
  Call<ExternalService> deleteExternalService(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/externalService/{id}?action=rollback')
  Call<Service> rollbackExternalService(@Path('id') String id)

  @POST('projects/{projectId}/externalService/{id}?action=upgrade')
  Call<Service> upgradeExternalService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceUpgrade serviceUpgrade)

  @POST('projects/{projectId}/externalService/{id}?action=restart')
  Call<Service> restartExternalService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceRestart serviceRestart)

  @POST('projects/{projectId}/externalService/{id}?action=remove')
  Call<Service> removeExternalService(@Path('id') String id)

  @POST('projects/{projectId}/externalService/{id}?action=deactivate')
  Call<Service> deactivateExternalService(@Path('id') String id)

  @POST('projects/{projectId}/externalService/{id}?action=finishupgrade')
  Call<Service> finishupgradeExternalService(@Path('id') String id)

  @POST('projects/{projectId}/externalService/{id}?action=continueupgrade')
  Call<Service> continueupgradeExternalService(@Path('id') String id)

  @POST('projects/{projectId}/externalService/{id}?action=activate')
  Call<Service> activateExternalService(@Path('id') String id)

  @POST('projects/{projectId}/externalService/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeExternalService(@Path('id') String id)

  @GET('projects/{projectId}/externalServiceEvent')
  Call<TypeCollection<ExternalServiceEvent>> listexternalServiceEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/externalServiceEvent')
  Call<TypeCollection<ExternalServiceEvent>> queryexternalServiceEvents(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/externalServiceEvent/{id}')
  Call<ExternalServiceEvent> findExternalServiceEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/externalServiceEvent/{id}?action=remove')
  Call<ExternalEvent> removeExternalServiceEvent(@Path('id') String id)

  @GET('projects/{projectId}/externalStoragePoolEvent')
  Call<TypeCollection<ExternalStoragePoolEvent>> listexternalStoragePoolEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/externalStoragePoolEvent')
  Call<TypeCollection<ExternalStoragePoolEvent>> queryexternalStoragePoolEvents(
    @Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/externalStoragePoolEvent/{id}')
  Call<ExternalStoragePoolEvent> findExternalStoragePoolEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/externalStoragePoolEvent/{id}?action=remove')
  Call<ExternalEvent> removeExternalStoragePoolEvent(@Path('id') String id)

  @GET('projects/{projectId}/externalVolumeEvent')
  Call<TypeCollection<ExternalVolumeEvent>> listexternalVolumeEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/externalVolumeEvent')
  Call<TypeCollection<ExternalVolumeEvent>> queryexternalVolumeEvents(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/externalVolumeEvent/{id}')
  Call<ExternalVolumeEvent> findExternalVolumeEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/externalVolumeEvent/{id}?action=remove')
  Call<ExternalEvent> removeExternalVolumeEvent(@Path('id') String id)

  @GET('projects/{projectId}/fieldDocumentation/{id}')
  Call<FieldDocumentation> findFieldDocumentationById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/genericObject')
  Call<TypeCollection<GenericObject>> listgenericObjects(@Path('projectId') String projectId)

  @GET('projects/{projectId}/genericObject')
  Call<TypeCollection<GenericObject>> querygenericObjects(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/genericObject')
  Call<GenericObject> createGenericObject(@Path('projectId') String projectId, @Body GenericObject genericObject)

  @GET('projects/{projectId}/genericObject/{id}')
  Call<GenericObject> findGenericObjectById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/genericObject/{id}')
  Call<GenericObject> updateGenericObject(@Path('projectId') String projectId, @Path('id') String id, @Body GenericObject genericObject)

  @DELETE('projects/{projectId}/genericObject/{id}')
  Call<GenericObject> deleteGenericObject(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/genericObject/{id}?action=remove')
  Call<GenericObject> removeGenericObject(@Path('id') String id)

  @GET('projects/{projectId}/healthcheckInstanceHostMap')
  Call<TypeCollection<HealthcheckInstanceHostMap>> listhealthcheckInstanceHostMaps(@Path('projectId') String projectId)

  @GET('projects/{projectId}/healthcheckInstanceHostMap')
  Call<TypeCollection<HealthcheckInstanceHostMap>> queryhealthcheckInstanceHostMaps(
    @Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/healthcheckInstanceHostMap/{id}')
  Call<HealthcheckInstanceHostMap> findHealthcheckInstanceHostMapById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/healthcheckInstanceHostMap/{id}?action=remove')
  Call<HealthcheckInstanceHostMap> removeHealthcheckInstanceHostMap(@Path('id') String id)

  @GET('projects/{projectId}/host')
  Call<TypeCollection<Host>> listhosts(@Path('projectId') String projectId)

  @GET('projects/{projectId}/host')
  Call<TypeCollection<Host>> queryhosts(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/host')
  Call<Host> createHost(@Path('projectId') String projectId, @Body Host host)

  @GET('projects/{projectId}/host/{id}')
  Call<Host> findHostById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/host/{id}')
  Call<Host> updateHost(@Path('projectId') String projectId, @Path('id') String id, @Body Host host)

  @DELETE('projects/{projectId}/host/{id}')
  Call<Host> deleteHost(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=evacuate')
  Call<Host> evacuateHost(@Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=provision')
  Call<Host> provisionHost(@Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=dockersocket')
  Call<HostAccess> dockersocketHost(@Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=activate')
  Call<Host> activateHost(@Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=purge')
  Call<Host> purgeHost(@Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=error')
  Call<Host> errorHost(@Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=remove')
  Call<Host> removeHost(@Path('id') String id)

  @POST('projects/{projectId}/host/{id}?action=deactivate')
  Call<Host> deactivateHost(@Path('id') String id)

  @GET('projects/{projectId}/hostAccess/{id}')
  Call<HostAccess> findHostAccessById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/hostTemplate')
  Call<TypeCollection<HostTemplate>> listhostTemplates(@Path('projectId') String projectId)

  @GET('projects/{projectId}/hostTemplate')
  Call<TypeCollection<HostTemplate>> queryhostTemplates(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/hostTemplate')
  Call<HostTemplate> createHostTemplate(@Path('projectId') String projectId, @Body HostTemplate hostTemplate)

  @GET('projects/{projectId}/hostTemplate/{id}')
  Call<HostTemplate> findHostTemplateById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/hostTemplate/{id}')
  Call<HostTemplate> updateHostTemplate(@Path('projectId') String projectId, @Path('id') String id, @Body HostTemplate hostTemplate)

  @DELETE('projects/{projectId}/hostTemplate/{id}')
  Call<HostTemplate> deleteHostTemplate(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/hostTemplate/{id}?action=remove')
  Call<HostTemplate> removeHostTemplate(@Path('id') String id)

  @GET('projects/{projectId}/identity')
  Call<TypeCollection<Identity>> listidentities(@Path('projectId') String projectId)

  @GET('projects/{projectId}/identity')
  Call<TypeCollection<Identity>> queryidentities(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/identity/{id}')
  Call<Identity> findIdentityById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/image')
  Call<TypeCollection<Image>> listimages(@Path('projectId') String projectId)

  @GET('projects/{projectId}/image')
  Call<TypeCollection<Image>> queryimages(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/image/{id}')
  Call<Image> findImageById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/image/{id}?action=activate')
  Call<Image> activateImage(@Path('id') String id)

  @POST('projects/{projectId}/image/{id}?action=purge')
  Call<Image> purgeImage(@Path('id') String id)

  @POST('projects/{projectId}/image/{id}?action=remove')
  Call<Image> removeImage(@Path('id') String id)

  @POST('projects/{projectId}/image/{id}?action=deactivate')
  Call<Image> deactivateImage(@Path('id') String id)

  @POST('projects/{projectId}/inServiceUpgradeStrategy')
  Call<InServiceUpgradeStrategy> createInServiceUpgradeStrategy(
    @Path('projectId') String projectId, @Body InServiceUpgradeStrategy inServiceUpgradeStrategy)

  @GET('projects/{projectId}/inServiceUpgradeStrategy/{id}')
  Call<InServiceUpgradeStrategy> findInServiceUpgradeStrategyById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/instance')
  Call<TypeCollection<Instance>> listinstances(@Path('projectId') String projectId)

  @GET('projects/{projectId}/instance')
  Call<TypeCollection<Instance>> queryinstances(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/instance/{id}')
  Call<Instance> findInstanceById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=updateunhealthy')
  Call<Instance> updateunhealthyInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=console')
  Call<InstanceConsole> consoleInstance(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST('projects/{projectId}/instance/{id}?action=restart')
  Call<Instance> restartInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=deallocate')
  Call<Instance> deallocateInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=start')
  Call<Instance> startInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=updatereinitializing')
  Call<Instance> updatereinitializingInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=purge')
  Call<Instance> purgeInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=error')
  Call<Instance> errorInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=remove')
  Call<Instance> removeInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=stop')
  Call<Instance> stopInstance(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceStop instanceStop)

  @POST('projects/{projectId}/instance/{id}?action=allocate')
  Call<Instance> allocateInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=updatehealthy')
  Call<Instance> updatehealthyInstance(@Path('id') String id)

  @POST('projects/{projectId}/instance/{id}?action=migrate')
  Call<Instance> migrateInstance(@Path('id') String id)

  @GET('projects/{projectId}/instanceConsole/{id}')
  Call<InstanceConsole> findInstanceConsoleById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/instanceConsoleInput/{id}')
  Call<InstanceConsoleInput> findInstanceConsoleInputById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/instanceHealthCheck')
  Call<InstanceHealthCheck> createInstanceHealthCheck(@Path('projectId') String projectId, @Body InstanceHealthCheck instanceHealthCheck)

  @GET('projects/{projectId}/instanceHealthCheck/{id}')
  Call<InstanceHealthCheck> findInstanceHealthCheckById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/instanceLink')
  Call<TypeCollection<InstanceLink>> listinstanceLinks(@Path('projectId') String projectId)

  @GET('projects/{projectId}/instanceLink')
  Call<TypeCollection<InstanceLink>> queryinstanceLinks(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/instanceLink/{id}')
  Call<InstanceLink> findInstanceLinkById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/instanceLink/{id}')
  Call<InstanceLink> updateInstanceLink(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceLink instanceLink)

  @POST('projects/{projectId}/instanceLink/{id}?action=activate')
  Call<InstanceLink> activateInstanceLink(@Path('id') String id)

  @POST('projects/{projectId}/instanceLink/{id}?action=purge')
  Call<InstanceLink> purgeInstanceLink(@Path('id') String id)

  @POST('projects/{projectId}/instanceLink/{id}?action=remove')
  Call<InstanceLink> removeInstanceLink(@Path('id') String id)

  @POST('projects/{projectId}/instanceLink/{id}?action=deactivate')
  Call<InstanceLink> deactivateInstanceLink(@Path('id') String id)

  @POST('projects/{projectId}/instanceStop')
  Call<InstanceStop> createInstanceStop(@Path('projectId') String projectId, @Body InstanceStop instanceStop)

  @GET('projects/{projectId}/instanceStop/{id}')
  Call<InstanceStop> findInstanceStopById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/ipAddress')
  Call<TypeCollection<IpAddress>> listipAddresses(@Path('projectId') String projectId)

  @GET('projects/{projectId}/ipAddress')
  Call<TypeCollection<IpAddress>> queryipAddresses(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/ipAddress/{id}')
  Call<IpAddress> findIpAddressById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/ipAddress/{id}?action=activate')
  Call<IpAddress> activateIpAddress(@Path('id') String id)

  @POST('projects/{projectId}/ipAddress/{id}?action=purge')
  Call<IpAddress> purgeIpAddress(@Path('id') String id)

  @POST('projects/{projectId}/ipAddress/{id}?action=remove')
  Call<IpAddress> removeIpAddress(@Path('id') String id)

  @POST('projects/{projectId}/ipAddress/{id}?action=associate')
  Call<IpAddress> associateIpAddress(@Path('id') String id)

  @POST('projects/{projectId}/ipAddress/{id}?action=deactivate')
  Call<IpAddress> deactivateIpAddress(@Path('id') String id)

  @POST('projects/{projectId}/ipAddress/{id}?action=disassociate')
  Call<IpAddress> disassociateIpAddress(@Path('id') String id)

  @GET('projects/{projectId}/kubernetesService')
  Call<TypeCollection<KubernetesService>> listkubernetesServices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/kubernetesService')
  Call<TypeCollection<KubernetesService>> querykubernetesServices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/kubernetesService/{id}')
  Call<KubernetesService> findKubernetesServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=rollback')
  Call<Service> rollbackKubernetesService(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=upgrade')
  Call<Service> upgradeKubernetesService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceUpgrade serviceUpgrade)

  @POST('projects/{projectId}/kubernetesService/{id}?action=restart')
  Call<Service> restartKubernetesService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceRestart serviceRestart)

  @POST('projects/{projectId}/kubernetesService/{id}?action=remove')
  Call<Service> removeKubernetesService(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=deactivate')
  Call<Service> deactivateKubernetesService(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=finishupgrade')
  Call<Service> finishupgradeKubernetesService(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=removeservicelink')
  Call<Service> removeservicelinkKubernetesService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/kubernetesService/{id}?action=continueupgrade')
  Call<Service> continueupgradeKubernetesService(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=activate')
  Call<Service> activateKubernetesService(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=addservicelink')
  Call<Service> addservicelinkKubernetesService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/kubernetesService/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeKubernetesService(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesService/{id}?action=setservicelinks')
  Call<Service> setservicelinksKubernetesService(
    @Path('projectId') String projectId, @Path('id') String id, @Body SetServiceLinksInput setServiceLinksInput)

  @GET('projects/{projectId}/kubernetesStack')
  Call<TypeCollection<KubernetesStack>> listkubernetesStacks(@Path('projectId') String projectId)

  @GET('projects/{projectId}/kubernetesStack')
  Call<TypeCollection<KubernetesStack>> querykubernetesStacks(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/kubernetesStack')
  Call<KubernetesStack> createKubernetesStack(@Path('projectId') String projectId, @Body KubernetesStack kubernetesStack)

  @GET('projects/{projectId}/kubernetesStack/{id}')
  Call<KubernetesStack> findKubernetesStackById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/kubernetesStack/{id}')
  Call<KubernetesStack> updateKubernetesStack(@Path('projectId') String projectId, @Path('id') String id, @Body KubernetesStack kubernetesStack)

  @DELETE('projects/{projectId}/kubernetesStack/{id}')
  Call<KubernetesStack> deleteKubernetesStack(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/kubernetesStack/{id}?action=rollback')
  Call<Stack> rollbackKubernetesStack(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesStack/{id}?action=upgrade')
  Call<KubernetesStack> upgradeKubernetesStack(
    @Path('projectId') String projectId, @Path('id') String id, @Body KubernetesStackUpgrade kubernetesStackUpgrade)

  @POST('projects/{projectId}/kubernetesStack/{id}?action=error')
  Call<Stack> errorKubernetesStack(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesStack/{id}?action=cancelupgrade')
  Call<Stack> cancelupgradeKubernetesStack(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesStack/{id}?action=remove')
  Call<Stack> removeKubernetesStack(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesStack/{id}?action=finishupgrade')
  Call<Stack> finishupgradeKubernetesStack(@Path('id') String id)

  @POST('projects/{projectId}/kubernetesStackUpgrade')
  Call<KubernetesStackUpgrade> createKubernetesStackUpgrade(@Path('projectId') String projectId, @Body KubernetesStackUpgrade kubernetesStackUpgrade)

  @GET('projects/{projectId}/kubernetesStackUpgrade/{id}')
  Call<KubernetesStackUpgrade> findKubernetesStackUpgradeById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/label')
  Call<TypeCollection<Label>> listlabels(@Path('projectId') String projectId)

  @GET('projects/{projectId}/label')
  Call<TypeCollection<Label>> querylabels(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/label/{id}')
  Call<Label> findLabelById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/label/{id}?action=remove')
  Call<Label> removeLabel(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig')
  Call<LaunchConfig> createLaunchConfig(@Path('projectId') String projectId, @Body LaunchConfig launchConfig)

  @GET('projects/{projectId}/launchConfig/{id}')
  Call<LaunchConfig> findLaunchConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/launchConfig/{id}')
  Call<LaunchConfig> updateLaunchConfig(@Path('projectId') String projectId, @Path('id') String id, @Body LaunchConfig launchConfig)

  @POST('projects/{projectId}/launchConfig/{id}?action=updateunhealthy')
  Call<Instance> updateunhealthyLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=console')
  Call<InstanceConsole> consoleLaunchConfig(
    @Path('projectId') String projectId, @Path('id') String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST('projects/{projectId}/launchConfig/{id}?action=restart')
  Call<Instance> restartLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=deallocate')
  Call<Instance> deallocateLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=start')
  Call<Instance> startLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=updatereinitializing')
  Call<Instance> updatereinitializingLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=purge')
  Call<Instance> purgeLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=error')
  Call<Instance> errorLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=remove')
  Call<Instance> removeLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=stop')
  Call<Instance> stopLaunchConfig(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceStop instanceStop)

  @POST('projects/{projectId}/launchConfig/{id}?action=allocate')
  Call<Instance> allocateLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=updatehealthy')
  Call<Instance> updatehealthyLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=migrate')
  Call<Instance> migrateLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/launchConfig/{id}?action=execute')
  Call<HostAccess> executeLaunchConfig(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerExec containerExec)

  @POST('projects/{projectId}/launchConfig/{id}?action=proxy')
  Call<HostAccess> proxyLaunchConfig(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerProxy containerProxy)

  @POST('projects/{projectId}/lbConfig')
  Call<LbConfig> createLbConfig(@Path('projectId') String projectId, @Body LbConfig lbConfig)

  @GET('projects/{projectId}/lbConfig/{id}')
  Call<LbConfig> findLbConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/lbTargetConfig/{id}')
  Call<LbTargetConfig> findLbTargetConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/loadBalancerCookieStickinessPolicy')
  Call<LoadBalancerCookieStickinessPolicy> createLoadBalancerCookieStickinessPolicy(
    @Path('projectId') String projectId, @Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy)

  @GET('projects/{projectId}/loadBalancerCookieStickinessPolicy/{id}')
  Call<LoadBalancerCookieStickinessPolicy> findLoadBalancerCookieStickinessPolicyById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/loadBalancerCookieStickinessPolicy/{id}')
  Call<LoadBalancerCookieStickinessPolicy> updateLoadBalancerCookieStickinessPolicy(
    @Path('projectId') String projectId, @Path('id') String id, @Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy)

  @GET('projects/{projectId}/loadBalancerService')
  Call<TypeCollection<LoadBalancerService>> listloadBalancerServices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/loadBalancerService')
  Call<TypeCollection<LoadBalancerService>> queryloadBalancerServices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/loadBalancerService')
  Call<LoadBalancerService> createLoadBalancerService(@Path('projectId') String projectId, @Body LoadBalancerService loadBalancerService)

  @GET('projects/{projectId}/loadBalancerService/{id}')
  Call<LoadBalancerService> findLoadBalancerServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/loadBalancerService/{id}')
  Call<LoadBalancerService> updateLoadBalancerService(
    @Path('projectId') String projectId, @Path('id') String id, @Body LoadBalancerService loadBalancerService)

  @DELETE('projects/{projectId}/loadBalancerService/{id}')
  Call<LoadBalancerService> deleteLoadBalancerService(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=rollback')
  Call<Service> rollbackLoadBalancerService(@Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=upgrade')
  Call<Service> upgradeLoadBalancerService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceUpgrade serviceUpgrade)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=restart')
  Call<Service> restartLoadBalancerService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceRestart serviceRestart)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=remove')
  Call<Service> removeLoadBalancerService(@Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=deactivate')
  Call<Service> deactivateLoadBalancerService(@Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=finishupgrade')
  Call<Service> finishupgradeLoadBalancerService(@Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=removeservicelink')
  Call<Service> removeservicelinkLoadBalancerService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=continueupgrade')
  Call<Service> continueupgradeLoadBalancerService(@Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=activate')
  Call<Service> activateLoadBalancerService(@Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=addservicelink')
  Call<Service> addservicelinkLoadBalancerService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeLoadBalancerService(@Path('id') String id)

  @POST('projects/{projectId}/loadBalancerService/{id}?action=setservicelinks')
  Call<Service> setservicelinksLoadBalancerService(
    @Path('projectId') String projectId, @Path('id') String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST('projects/{projectId}/logConfig')
  Call<LogConfig> createLogConfig(@Path('projectId') String projectId, @Body LogConfig logConfig)

  @GET('projects/{projectId}/logConfig/{id}')
  Call<LogConfig> findLogConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/machine')
  Call<TypeCollection<Machine>> listmachines(@Path('projectId') String projectId)

  @GET('projects/{projectId}/machine')
  Call<TypeCollection<Machine>> querymachines(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/machine')
  Call<Machine> createMachine(@Path('projectId') String projectId, @Body Machine machine)

  @GET('projects/{projectId}/machine/{id}')
  Call<Machine> findMachineById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/machine/{id}')
  Call<Machine> updateMachine(@Path('projectId') String projectId, @Path('id') String id, @Body Machine machine)

  @DELETE('projects/{projectId}/machine/{id}')
  Call<Machine> deleteMachine(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/machine/{id}?action=bootstrap')
  Call<PhysicalHost> bootstrapMachine(@Path('id') String id)

  @POST('projects/{projectId}/machine/{id}?action=error')
  Call<PhysicalHost> errorMachine(@Path('id') String id)

  @POST('projects/{projectId}/machine/{id}?action=remove')
  Call<PhysicalHost> removeMachine(@Path('id') String id)

  @GET('projects/{projectId}/machineDriver')
  Call<TypeCollection<MachineDriver>> listmachineDrivers(@Path('projectId') String projectId)

  @GET('projects/{projectId}/machineDriver')
  Call<TypeCollection<MachineDriver>> querymachineDrivers(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/machineDriver/{id}')
  Call<MachineDriver> findMachineDriverById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/mount')
  Call<TypeCollection<Mount>> listmounts(@Path('projectId') String projectId)

  @GET('projects/{projectId}/mount')
  Call<TypeCollection<Mount>> querymounts(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/mount/{id}')
  Call<Mount> findMountById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/mount/{id}?action=remove')
  Call<Mount> removeMount(@Path('id') String id)

  @POST('projects/{projectId}/mount/{id}?action=deactivate')
  Call<Mount> deactivateMount(@Path('id') String id)

  @GET('projects/{projectId}/mountEntry/{id}')
  Call<MountEntry> findMountEntryById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/network')
  Call<TypeCollection<Network>> listnetworks(@Path('projectId') String projectId)

  @GET('projects/{projectId}/network')
  Call<TypeCollection<Network>> querynetworks(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/network')
  Call<Network> createNetwork(@Path('projectId') String projectId, @Body Network network)

  @GET('projects/{projectId}/network/{id}')
  Call<Network> findNetworkById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/network/{id}')
  Call<Network> updateNetwork(@Path('projectId') String projectId, @Path('id') String id, @Body Network network)

  @DELETE('projects/{projectId}/network/{id}')
  Call<Network> deleteNetwork(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/network/{id}?action=activate')
  Call<Network> activateNetwork(@Path('id') String id)

  @POST('projects/{projectId}/network/{id}?action=purge')
  Call<Network> purgeNetwork(@Path('id') String id)

  @POST('projects/{projectId}/network/{id}?action=remove')
  Call<Network> removeNetwork(@Path('id') String id)

  @POST('projects/{projectId}/network/{id}?action=deactivate')
  Call<Network> deactivateNetwork(@Path('id') String id)

  @GET('projects/{projectId}/networkDriver')
  Call<TypeCollection<NetworkDriver>> listnetworkDrivers(@Path('projectId') String projectId)

  @GET('projects/{projectId}/networkDriver')
  Call<TypeCollection<NetworkDriver>> querynetworkDrivers(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/networkDriver/{id}')
  Call<NetworkDriver> findNetworkDriverById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/networkDriver/{id}?action=activate')
  Call<NetworkDriver> activateNetworkDriver(@Path('id') String id)

  @POST('projects/{projectId}/networkDriver/{id}?action=remove')
  Call<NetworkDriver> removeNetworkDriver(@Path('id') String id)

  @POST('projects/{projectId}/networkDriver/{id}?action=deactivate')
  Call<NetworkDriver> deactivateNetworkDriver(@Path('id') String id)

  @GET('projects/{projectId}/networkDriverService')
  Call<TypeCollection<NetworkDriverService>> listnetworkDriverServices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/networkDriverService')
  Call<TypeCollection<NetworkDriverService>> querynetworkDriverServices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/networkDriverService')
  Call<NetworkDriverService> createNetworkDriverService(@Path('projectId') String projectId, @Body NetworkDriverService networkDriverService)

  @GET('projects/{projectId}/networkDriverService/{id}')
  Call<NetworkDriverService> findNetworkDriverServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/networkDriverService/{id}')
  Call<NetworkDriverService> updateNetworkDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body NetworkDriverService networkDriverService)

  @DELETE('projects/{projectId}/networkDriverService/{id}')
  Call<NetworkDriverService> deleteNetworkDriverService(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=rollback')
  Call<Service> rollbackNetworkDriverService(@Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=upgrade')
  Call<Service> upgradeNetworkDriverService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceUpgrade serviceUpgrade)

  @POST('projects/{projectId}/networkDriverService/{id}?action=restart')
  Call<Service> restartNetworkDriverService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceRestart serviceRestart)

  @POST('projects/{projectId}/networkDriverService/{id}?action=remove')
  Call<Service> removeNetworkDriverService(@Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=deactivate')
  Call<Service> deactivateNetworkDriverService(@Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=finishupgrade')
  Call<Service> finishupgradeNetworkDriverService(@Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=removeservicelink')
  Call<Service> removeservicelinkNetworkDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/networkDriverService/{id}?action=continueupgrade')
  Call<Service> continueupgradeNetworkDriverService(@Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=activate')
  Call<Service> activateNetworkDriverService(@Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=addservicelink')
  Call<Service> addservicelinkNetworkDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/networkDriverService/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeNetworkDriverService(@Path('id') String id)

  @POST('projects/{projectId}/networkDriverService/{id}?action=setservicelinks')
  Call<Service> setservicelinksNetworkDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST('projects/{projectId}/networkPolicyRule')
  Call<NetworkPolicyRule> createNetworkPolicyRule(@Path('projectId') String projectId, @Body NetworkPolicyRule networkPolicyRule)

  @GET('projects/{projectId}/networkPolicyRule/{id}')
  Call<NetworkPolicyRule> findNetworkPolicyRuleById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/networkPolicyRuleBetween')
  Call<NetworkPolicyRuleBetween> createNetworkPolicyRuleBetween(
    @Path('projectId') String projectId, @Body NetworkPolicyRuleBetween networkPolicyRuleBetween)

  @GET('projects/{projectId}/networkPolicyRuleBetween/{id}')
  Call<NetworkPolicyRuleBetween> findNetworkPolicyRuleBetweenById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/networkPolicyRuleMember')
  Call<NetworkPolicyRuleMember> createNetworkPolicyRuleMember(
    @Path('projectId') String projectId, @Body NetworkPolicyRuleMember networkPolicyRuleMember)

  @GET('projects/{projectId}/networkPolicyRuleMember/{id}')
  Call<NetworkPolicyRuleMember> findNetworkPolicyRuleMemberById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/networkPolicyRuleWithin')
  Call<TypeCollection<NetworkPolicyRuleWithin>> listnetworkPolicyRuleWithins(@Path('projectId') String projectId)

  @GET('projects/{projectId}/networkPolicyRuleWithin')
  Call<TypeCollection<NetworkPolicyRuleWithin>> querynetworkPolicyRuleWithins(
    @Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/networkPolicyRuleWithin')
  Call<NetworkPolicyRuleWithin> createNetworkPolicyRuleWithin(
    @Path('projectId') String projectId, @Body NetworkPolicyRuleWithin networkPolicyRuleWithin)

  @GET('projects/{projectId}/networkPolicyRuleWithin/{id}')
  Call<NetworkPolicyRuleWithin> findNetworkPolicyRuleWithinById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/nfsConfig/{id}')
  Call<NfsConfig> findNfsConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/packetConfig')
  Call<PacketConfig> createPacketConfig(@Path('projectId') String projectId, @Body PacketConfig packetConfig)

  @GET('projects/{projectId}/packetConfig/{id}')
  Call<PacketConfig> findPacketConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/password')
  Call<TypeCollection<Password>> listpasswords(@Path('projectId') String projectId)

  @GET('projects/{projectId}/password')
  Call<TypeCollection<Password>> querypasswords(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/password')
  Call<Password> createPassword(@Path('projectId') String projectId, @Body Password password)

  @GET('projects/{projectId}/password/{id}')
  Call<Password> findPasswordById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/password/{id}')
  Call<Password> updatePassword(@Path('projectId') String projectId, @Path('id') String id, @Body Password password)

  @DELETE('projects/{projectId}/password/{id}')
  Call<Password> deletePassword(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/password/{id}?action=activate')
  Call<Credential> activatePassword(@Path('id') String id)

  @POST('projects/{projectId}/password/{id}?action=purge')
  Call<Credential> purgePassword(@Path('id') String id)

  @POST('projects/{projectId}/password/{id}?action=remove')
  Call<Credential> removePassword(@Path('id') String id)

  @POST('projects/{projectId}/password/{id}?action=deactivate')
  Call<Credential> deactivatePassword(@Path('id') String id)

  @POST('projects/{projectId}/password/{id}?action=changesecret')
  Call<ChangeSecretInput> changesecretPassword(@Path('projectId') String projectId, @Path('id') String id, @Body ChangeSecretInput changeSecretInput)

  @GET('projects/{projectId}/physicalHost')
  Call<TypeCollection<PhysicalHost>> listphysicalHosts(@Path('projectId') String projectId)

  @GET('projects/{projectId}/physicalHost')
  Call<TypeCollection<PhysicalHost>> queryphysicalHosts(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/physicalHost/{id}')
  Call<PhysicalHost> findPhysicalHostById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/physicalHost/{id}?action=bootstrap')
  Call<PhysicalHost> bootstrapPhysicalHost(@Path('id') String id)

  @POST('projects/{projectId}/physicalHost/{id}?action=error')
  Call<PhysicalHost> errorPhysicalHost(@Path('id') String id)

  @POST('projects/{projectId}/physicalHost/{id}?action=remove')
  Call<PhysicalHost> removePhysicalHost(@Path('id') String id)

  @GET('projects/{projectId}/port')
  Call<TypeCollection<Port>> listports(@Path('projectId') String projectId)

  @GET('projects/{projectId}/port')
  Call<TypeCollection<Port>> queryports(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/port/{id}')
  Call<Port> findPortById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/port/{id}')
  Call<Port> updatePort(@Path('projectId') String projectId, @Path('id') String id, @Body Port port)

  @POST('projects/{projectId}/port/{id}?action=activate')
  Call<Port> activatePort(@Path('id') String id)

  @POST('projects/{projectId}/port/{id}?action=purge')
  Call<Port> purgePort(@Path('id') String id)

  @POST('projects/{projectId}/port/{id}?action=remove')
  Call<Port> removePort(@Path('id') String id)

  @POST('projects/{projectId}/port/{id}?action=deactivate')
  Call<Port> deactivatePort(@Path('id') String id)

  @POST('projects/{projectId}/portRule')
  Call<PortRule> createPortRule(@Path('projectId') String projectId, @Body PortRule portRule)

  @GET('projects/{projectId}/portRule/{id}')
  Call<PortRule> findPortRuleById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/project')
  Call<TypeCollection<Project>> listprojects(@Path('projectId') String projectId)

  @GET('projects/{projectId}/project')
  Call<TypeCollection<Project>> queryprojects(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/project/{id}')
  Call<Project> findProjectById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/project/{id}?action=upgrade')
  Call<Account> upgradeProject(@Path('id') String id)

  @POST('projects/{projectId}/project/{id}?action=activate')
  Call<Account> activateProject(@Path('id') String id)

  @POST('projects/{projectId}/project/{id}?action=purge')
  Call<Account> purgeProject(@Path('id') String id)

  @POST('projects/{projectId}/project/{id}?action=remove')
  Call<Account> removeProject(@Path('id') String id)

  @POST('projects/{projectId}/project/{id}?action=deactivate')
  Call<Account> deactivateProject(@Path('id') String id)

  @POST('projects/{projectId}/project/{id}?action=setmembers')
  Call<SetProjectMembersInput> setmembersProject(
    @Path('projectId') String projectId, @Path('id') String id, @Body SetProjectMembersInput setProjectMembersInput)

  @GET('projects/{projectId}/projectMember')
  Call<TypeCollection<ProjectMember>> listprojectMembers(@Path('projectId') String projectId)

  @GET('projects/{projectId}/projectMember')
  Call<TypeCollection<ProjectMember>> queryprojectMembers(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/projectMember/{id}')
  Call<ProjectMember> findProjectMemberById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/projectMember/{id}?action=activate')
  Call<ProjectMember> activateProjectMember(@Path('id') String id)

  @POST('projects/{projectId}/projectMember/{id}?action=purge')
  Call<ProjectMember> purgeProjectMember(@Path('id') String id)

  @POST('projects/{projectId}/projectMember/{id}?action=remove')
  Call<ProjectMember> removeProjectMember(@Path('id') String id)

  @POST('projects/{projectId}/projectMember/{id}?action=deactivate')
  Call<ProjectMember> deactivateProjectMember(@Path('id') String id)

  @GET('projects/{projectId}/projectTemplate')
  Call<TypeCollection<ProjectTemplate>> listprojectTemplates(@Path('projectId') String projectId)

  @GET('projects/{projectId}/projectTemplate')
  Call<TypeCollection<ProjectTemplate>> queryprojectTemplates(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/projectTemplate/{id}')
  Call<ProjectTemplate> findProjectTemplateById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/projectTemplate/{id}?action=remove')
  Call<ProjectTemplate> removeProjectTemplate(@Path('id') String id)

  @GET('projects/{projectId}/publicEndpoint/{id}')
  Call<PublicEndpoint> findPublicEndpointById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/pullTask')
  Call<TypeCollection<PullTask>> listpullTasks(@Path('projectId') String projectId)

  @GET('projects/{projectId}/pullTask')
  Call<TypeCollection<PullTask>> querypullTasks(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/pullTask')
  Call<PullTask> createPullTask(@Path('projectId') String projectId, @Body PullTask pullTask)

  @GET('projects/{projectId}/pullTask/{id}')
  Call<PullTask> findPullTaskById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/pullTask/{id}?action=remove')
  Call<GenericObject> removePullTask(@Path('id') String id)

  @POST('projects/{projectId}/recreateOnQuorumStrategyConfig')
  Call<RecreateOnQuorumStrategyConfig> createRecreateOnQuorumStrategyConfig(
    @Path('projectId') String projectId, @Body RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig)

  @GET('projects/{projectId}/recreateOnQuorumStrategyConfig/{id}')
  Call<RecreateOnQuorumStrategyConfig> findRecreateOnQuorumStrategyConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/region')
  Call<TypeCollection<Region>> listregions(@Path('projectId') String projectId)

  @GET('projects/{projectId}/region')
  Call<TypeCollection<Region>> queryregions(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/region/{id}')
  Call<Region> findRegionById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/region/{id}?action=activate')
  Call<Region> activateRegion(@Path('id') String id)

  @POST('projects/{projectId}/region/{id}?action=purge')
  Call<Region> purgeRegion(@Path('id') String id)

  @POST('projects/{projectId}/region/{id}?action=remove')
  Call<Region> removeRegion(@Path('id') String id)

  @POST('projects/{projectId}/region/{id}?action=deactivate')
  Call<Region> deactivateRegion(@Path('id') String id)

  @GET('projects/{projectId}/register')
  Call<TypeCollection<Register>> listregister(@Path('projectId') String projectId)

  @GET('projects/{projectId}/register')
  Call<TypeCollection<Register>> queryregister(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/register')
  Call<Register> createRegister(@Path('projectId') String projectId, @Body Register register)

  @GET('projects/{projectId}/register/{id}')
  Call<Register> findRegisterById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/register/{id}?action=remove')
  Call<GenericObject> removeRegister(@Path('id') String id)

  @POST('projects/{projectId}/register/{id}?action=stop')
  Call<Instance> stopRegister(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceStop instanceStop)

  @GET('projects/{projectId}/registrationToken')
  Call<TypeCollection<RegistrationToken>> listregistrationTokens(@Path('projectId') String projectId)

  @GET('projects/{projectId}/registrationToken')
  Call<TypeCollection<RegistrationToken>> queryregistrationTokens(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/registrationToken')
  Call<RegistrationToken> createRegistrationToken(@Path('projectId') String projectId, @Body RegistrationToken registrationToken)

  @GET('projects/{projectId}/registrationToken/{id}')
  Call<RegistrationToken> findRegistrationTokenById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/registrationToken/{id}?action=activate')
  Call<Credential> activateRegistrationToken(@Path('id') String id)

  @POST('projects/{projectId}/registrationToken/{id}?action=purge')
  Call<Credential> purgeRegistrationToken(@Path('id') String id)

  @POST('projects/{projectId}/registrationToken/{id}?action=remove')
  Call<Credential> removeRegistrationToken(@Path('id') String id)

  @POST('projects/{projectId}/registrationToken/{id}?action=deactivate')
  Call<Credential> deactivateRegistrationToken(@Path('id') String id)

  @GET('projects/{projectId}/registry')
  Call<TypeCollection<Registry>> listregistries(@Path('projectId') String projectId)

  @GET('projects/{projectId}/registry')
  Call<TypeCollection<Registry>> queryregistries(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/registry')
  Call<Registry> createRegistry(@Path('projectId') String projectId, @Body Registry registry)

  @GET('projects/{projectId}/registry/{id}')
  Call<Registry> findRegistryById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/registry/{id}')
  Call<Registry> updateRegistry(@Path('projectId') String projectId, @Path('id') String id, @Body Registry registry)

  @DELETE('projects/{projectId}/registry/{id}')
  Call<Registry> deleteRegistry(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/registry/{id}?action=activate')
  Call<StoragePool> activateRegistry(@Path('id') String id)

  @POST('projects/{projectId}/registry/{id}?action=purge')
  Call<StoragePool> purgeRegistry(@Path('id') String id)

  @POST('projects/{projectId}/registry/{id}?action=remove')
  Call<StoragePool> removeRegistry(@Path('id') String id)

  @POST('projects/{projectId}/registry/{id}?action=deactivate')
  Call<StoragePool> deactivateRegistry(@Path('id') String id)

  @GET('projects/{projectId}/registryCredential')
  Call<TypeCollection<RegistryCredential>> listregistryCredentials(@Path('projectId') String projectId)

  @GET('projects/{projectId}/registryCredential')
  Call<TypeCollection<RegistryCredential>> queryregistryCredentials(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/registryCredential')
  Call<RegistryCredential> createRegistryCredential(@Path('projectId') String projectId, @Body RegistryCredential registryCredential)

  @GET('projects/{projectId}/registryCredential/{id}')
  Call<RegistryCredential> findRegistryCredentialById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/registryCredential/{id}')
  Call<RegistryCredential> updateRegistryCredential(
    @Path('projectId') String projectId, @Path('id') String id, @Body RegistryCredential registryCredential)

  @DELETE('projects/{projectId}/registryCredential/{id}')
  Call<RegistryCredential> deleteRegistryCredential(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/registryCredential/{id}?action=activate')
  Call<Credential> activateRegistryCredential(@Path('id') String id)

  @POST('projects/{projectId}/registryCredential/{id}?action=purge')
  Call<Credential> purgeRegistryCredential(@Path('id') String id)

  @POST('projects/{projectId}/registryCredential/{id}?action=remove')
  Call<Credential> removeRegistryCredential(@Path('id') String id)

  @POST('projects/{projectId}/registryCredential/{id}?action=deactivate')
  Call<Credential> deactivateRegistryCredential(@Path('id') String id)

  @POST('projects/{projectId}/restartPolicy')
  Call<RestartPolicy> createRestartPolicy(@Path('projectId') String projectId, @Body RestartPolicy restartPolicy)

  @GET('projects/{projectId}/restartPolicy/{id}')
  Call<RestartPolicy> findRestartPolicyById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/restoreFromBackupInput/{id}')
  Call<RestoreFromBackupInput> findRestoreFromBackupInputById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/revertToSnapshotInput/{id}')
  Call<RevertToSnapshotInput> findRevertToSnapshotInputById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/rollingRestartStrategy')
  Call<RollingRestartStrategy> createRollingRestartStrategy(@Path('projectId') String projectId, @Body RollingRestartStrategy rollingRestartStrategy)

  @GET('projects/{projectId}/rollingRestartStrategy/{id}')
  Call<RollingRestartStrategy> findRollingRestartStrategyById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/scalePolicy/{id}')
  Call<ScalePolicy> findScalePolicyById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/scheduledUpgrade')
  Call<TypeCollection<ScheduledUpgrade>> listscheduledUpgrades(@Path('projectId') String projectId)

  @GET('projects/{projectId}/scheduledUpgrade')
  Call<TypeCollection<ScheduledUpgrade>> queryscheduledUpgrades(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/scheduledUpgrade/{id}')
  Call<ScheduledUpgrade> findScheduledUpgradeById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/scheduledUpgrade/{id}?action=start')
  Call<ScheduledUpgrade> startScheduledUpgrade(@Path('id') String id)

  @POST('projects/{projectId}/scheduledUpgrade/{id}?action=remove')
  Call<ScheduledUpgrade> removeScheduledUpgrade(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig')
  Call<SecondaryLaunchConfig> createSecondaryLaunchConfig(@Path('projectId') String projectId, @Body SecondaryLaunchConfig secondaryLaunchConfig)

  @GET('projects/{projectId}/secondaryLaunchConfig/{id}')
  Call<SecondaryLaunchConfig> findSecondaryLaunchConfigById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/secondaryLaunchConfig/{id}')
  Call<SecondaryLaunchConfig> updateSecondaryLaunchConfig(
    @Path('projectId') String projectId, @Path('id') String id, @Body SecondaryLaunchConfig secondaryLaunchConfig)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=updateunhealthy')
  Call<Instance> updateunhealthySecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=console')
  Call<InstanceConsole> consoleSecondaryLaunchConfig(
    @Path('projectId') String projectId, @Path('id') String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=restart')
  Call<Instance> restartSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=deallocate')
  Call<Instance> deallocateSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=start')
  Call<Instance> startSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=updatereinitializing')
  Call<Instance> updatereinitializingSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=purge')
  Call<Instance> purgeSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=error')
  Call<Instance> errorSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=remove')
  Call<Instance> removeSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=stop')
  Call<Instance> stopSecondaryLaunchConfig(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceStop instanceStop)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=allocate')
  Call<Instance> allocateSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=updatehealthy')
  Call<Instance> updatehealthySecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=migrate')
  Call<Instance> migrateSecondaryLaunchConfig(@Path('id') String id)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=execute')
  Call<HostAccess> executeSecondaryLaunchConfig(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerExec containerExec)

  @POST('projects/{projectId}/secondaryLaunchConfig/{id}?action=proxy')
  Call<HostAccess> proxySecondaryLaunchConfig(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerProxy containerProxy)

  @GET('projects/{projectId}/secret')
  Call<TypeCollection<Secret>> listsecrets(@Path('projectId') String projectId)

  @GET('projects/{projectId}/secret')
  Call<TypeCollection<Secret>> querysecrets(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/secret')
  Call<Secret> createSecret(@Path('projectId') String projectId, @Body Secret secret)

  @GET('projects/{projectId}/secret/{id}')
  Call<Secret> findSecretById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/secret/{id}')
  Call<Secret> updateSecret(@Path('projectId') String projectId, @Path('id') String id, @Body Secret secret)

  @DELETE('projects/{projectId}/secret/{id}')
  Call<Secret> deleteSecret(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/secret/{id}?action=remove')
  Call<Secret> removeSecret(@Path('id') String id)

  @POST('projects/{projectId}/secretReference')
  Call<SecretReference> createSecretReference(@Path('projectId') String projectId, @Body SecretReference secretReference)

  @GET('projects/{projectId}/secretReference/{id}')
  Call<SecretReference> findSecretReferenceById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/service')
  Call<TypeCollection<Service>> listservices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/service')
  Call<TypeCollection<Service>> queryservices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/service')
  Call<Service> createService(@Path('projectId') String projectId, @Body Service service)

  @GET('projects/{projectId}/service/{id}')
  Call<Service> findServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/service/{id}')
  Call<Service> updateService(@Path('projectId') String projectId, @Path('id') String id, @Body Service service)

  @DELETE('projects/{projectId}/service/{id}')
  Call<Service> deleteService(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=rollback')
  Call<Service> rollbackService(@Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=upgrade')
  Call<Service> upgradeService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceUpgrade serviceUpgrade)

  @POST('projects/{projectId}/service/{id}?action=restart')
  Call<Service> restartService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceRestart serviceRestart)

  @POST('projects/{projectId}/service/{id}?action=remove')
  Call<Service> removeService(@Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=deactivate')
  Call<Service> deactivateService(@Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=finishupgrade')
  Call<Service> finishupgradeService(@Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=removeservicelink')
  Call<Service> removeservicelinkService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/service/{id}?action=continueupgrade')
  Call<Service> continueupgradeService(@Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=activate')
  Call<Service> activateService(@Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=addservicelink')
  Call<Service> addservicelinkService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/service/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeService(@Path('id') String id)

  @POST('projects/{projectId}/service/{id}?action=setservicelinks')
  Call<Service> setservicelinksService(@Path('projectId') String projectId, @Path('id') String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST('projects/{projectId}/serviceBinding')
  Call<ServiceBinding> createServiceBinding(@Path('projectId') String projectId, @Body ServiceBinding serviceBinding)

  @GET('projects/{projectId}/serviceBinding/{id}')
  Call<ServiceBinding> findServiceBindingById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/serviceBinding/{id}')
  Call<ServiceBinding> updateServiceBinding(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceBinding serviceBinding)

  @GET('projects/{projectId}/serviceConsumeMap')
  Call<TypeCollection<ServiceConsumeMap>> listserviceConsumeMaps(@Path('projectId') String projectId)

  @GET('projects/{projectId}/serviceConsumeMap')
  Call<TypeCollection<ServiceConsumeMap>> queryserviceConsumeMaps(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/serviceConsumeMap/{id}')
  Call<ServiceConsumeMap> findServiceConsumeMapById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/serviceConsumeMap/{id}?action=remove')
  Call<ServiceConsumeMap> removeServiceConsumeMap(@Path('id') String id)

  @GET('projects/{projectId}/serviceEvent')
  Call<TypeCollection<ServiceEvent>> listserviceEvents(@Path('projectId') String projectId)

  @GET('projects/{projectId}/serviceEvent')
  Call<TypeCollection<ServiceEvent>> queryserviceEvents(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/serviceEvent/{id}')
  Call<ServiceEvent> findServiceEventById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/serviceEvent/{id}?action=remove')
  Call<ServiceEvent> removeServiceEvent(@Path('id') String id)

  @GET('projects/{projectId}/serviceExposeMap')
  Call<TypeCollection<ServiceExposeMap>> listserviceExposeMaps(@Path('projectId') String projectId)

  @GET('projects/{projectId}/serviceExposeMap')
  Call<TypeCollection<ServiceExposeMap>> queryserviceExposeMaps(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/serviceExposeMap/{id}')
  Call<ServiceExposeMap> findServiceExposeMapById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/serviceExposeMap/{id}?action=remove')
  Call<ServiceExposeMap> removeServiceExposeMap(@Path('id') String id)

  @POST('projects/{projectId}/serviceLink')
  Call<ServiceLink> createServiceLink(@Path('projectId') String projectId, @Body ServiceLink serviceLink)

  @GET('projects/{projectId}/serviceLink/{id}')
  Call<ServiceLink> findServiceLinkById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/serviceLog')
  Call<TypeCollection<ServiceLog>> listserviceLogs(@Path('projectId') String projectId)

  @GET('projects/{projectId}/serviceLog')
  Call<TypeCollection<ServiceLog>> queryserviceLogs(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/serviceLog/{id}')
  Call<ServiceLog> findServiceLogById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/serviceProxy')
  Call<TypeCollection<ServiceProxy>> listserviceProxies(@Path('projectId') String projectId)

  @GET('projects/{projectId}/serviceProxy')
  Call<TypeCollection<ServiceProxy>> queryserviceProxies(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/serviceProxy')
  Call<ServiceProxy> createServiceProxy(@Path('projectId') String projectId, @Body ServiceProxy serviceProxy)

  @GET('projects/{projectId}/serviceProxy/{id}')
  Call<ServiceProxy> findServiceProxyById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/serviceRestart')
  Call<ServiceRestart> createServiceRestart(@Path('projectId') String projectId, @Body ServiceRestart serviceRestart)

  @GET('projects/{projectId}/serviceRestart/{id}')
  Call<ServiceRestart> findServiceRestartById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/serviceUpgrade')
  Call<ServiceUpgrade> createServiceUpgrade(@Path('projectId') String projectId, @Body ServiceUpgrade serviceUpgrade)

  @GET('projects/{projectId}/serviceUpgrade/{id}')
  Call<ServiceUpgrade> findServiceUpgradeById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/serviceUpgradeStrategy/{id}')
  Call<ServiceUpgradeStrategy> findServiceUpgradeStrategyById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/servicesPortRange')
  Call<ServicesPortRange> createServicesPortRange(@Path('projectId') String projectId, @Body ServicesPortRange servicesPortRange)

  @GET('projects/{projectId}/servicesPortRange/{id}')
  Call<ServicesPortRange> findServicesPortRangeById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/servicesPortRange/{id}')
  Call<ServicesPortRange> updateServicesPortRange(
    @Path('projectId') String projectId, @Path('id') String id, @Body ServicesPortRange servicesPortRange)

  @POST('projects/{projectId}/setProjectMembersInput')
  Call<SetProjectMembersInput> createSetProjectMembersInput(@Path('projectId') String projectId, @Body SetProjectMembersInput setProjectMembersInput)

  @GET('projects/{projectId}/setProjectMembersInput/{id}')
  Call<SetProjectMembersInput> findSetProjectMembersInputById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/setServiceLinksInput')
  Call<SetServiceLinksInput> createSetServiceLinksInput(@Path('projectId') String projectId, @Body SetServiceLinksInput setServiceLinksInput)

  @GET('projects/{projectId}/setServiceLinksInput/{id}')
  Call<SetServiceLinksInput> findSetServiceLinksInputById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/setting')
  Call<TypeCollection<Setting>> listsettings(@Path('projectId') String projectId)

  @GET('projects/{projectId}/setting')
  Call<TypeCollection<Setting>> querysettings(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/setting/{id}')
  Call<Setting> findSettingById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/snapshot')
  Call<TypeCollection<Snapshot>> listsnapshots(@Path('projectId') String projectId)

  @GET('projects/{projectId}/snapshot')
  Call<TypeCollection<Snapshot>> querysnapshots(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/snapshot/{id}')
  Call<Snapshot> findSnapshotById(@Path('projectId') String projectId, @Path('id') String id)

  @DELETE('projects/{projectId}/snapshot/{id}')
  Call<Snapshot> deleteSnapshot(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/snapshot/{id}?action=backup')
  Call<Backup> backupSnapshot(@Path('projectId') String projectId, @Path('id') String id, @Body SnapshotBackupInput snapshotBackupInput)

  @POST('projects/{projectId}/snapshot/{id}?action=remove')
  Call<Snapshot> removeSnapshot(@Path('id') String id)

  @GET('projects/{projectId}/snapshotBackupInput/{id}')
  Call<SnapshotBackupInput> findSnapshotBackupInputById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/stack')
  Call<TypeCollection<Stack>> liststacks(@Path('projectId') String projectId)

  @GET('projects/{projectId}/stack')
  Call<TypeCollection<Stack>> querystacks(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/stack')
  Call<Stack> createStack(@Path('projectId') String projectId, @Body Stack stack)

  @GET('projects/{projectId}/stack/{id}')
  Call<Stack> findStackById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/stack/{id}')
  Call<Stack> updateStack(@Path('projectId') String projectId, @Path('id') String id, @Body Stack stack)

  @DELETE('projects/{projectId}/stack/{id}')
  Call<Stack> deleteStack(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/stack/{id}?action=rollback')
  Call<Stack> rollbackStack(@Path('id') String id)

  @POST('projects/{projectId}/stack/{id}?action=deactivateservices')
  Call<Stack> deactivateservicesStack(@Path('id') String id)

  @POST('projects/{projectId}/stack/{id}?action=activateservices')
  Call<Stack> activateservicesStack(@Path('id') String id)

  @POST('projects/{projectId}/stack/{id}?action=upgrade')
  Call<Stack> upgradeStack(@Path('projectId') String projectId, @Path('id') String id, @Body StackUpgrade stackUpgrade)

  @POST('projects/{projectId}/stack/{id}?action=addoutputs')
  Call<Stack> addoutputsStack(@Path('projectId') String projectId, @Path('id') String id, @Body AddOutputsInput addOutputsInput)

  @POST('projects/{projectId}/stack/{id}?action=exportconfig')
  Call<ComposeConfig> exportconfigStack(@Path('projectId') String projectId, @Path('id') String id, @Body ComposeConfigInput composeConfigInput)

  @POST('projects/{projectId}/stack/{id}?action=error')
  Call<Stack> errorStack(@Path('id') String id)

  @POST('projects/{projectId}/stack/{id}?action=cancelupgrade')
  Call<Stack> cancelupgradeStack(@Path('id') String id)

  @POST('projects/{projectId}/stack/{id}?action=remove')
  Call<Stack> removeStack(@Path('id') String id)

  @POST('projects/{projectId}/stack/{id}?action=finishupgrade')
  Call<Stack> finishupgradeStack(@Path('id') String id)

  @POST('projects/{projectId}/stackUpgrade')
  Call<StackUpgrade> createStackUpgrade(@Path('projectId') String projectId, @Body StackUpgrade stackUpgrade)

  @GET('projects/{projectId}/stackUpgrade/{id}')
  Call<StackUpgrade> findStackUpgradeById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/statsAccess/{id}')
  Call<StatsAccess> findStatsAccessById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/storageDriver')
  Call<TypeCollection<StorageDriver>> liststorageDrivers(@Path('projectId') String projectId)

  @GET('projects/{projectId}/storageDriver')
  Call<TypeCollection<StorageDriver>> querystorageDrivers(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/storageDriver/{id}')
  Call<StorageDriver> findStorageDriverById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/storageDriver/{id}?action=activate')
  Call<StorageDriver> activateStorageDriver(@Path('id') String id)

  @POST('projects/{projectId}/storageDriver/{id}?action=remove')
  Call<StorageDriver> removeStorageDriver(@Path('id') String id)

  @POST('projects/{projectId}/storageDriver/{id}?action=deactivate')
  Call<StorageDriver> deactivateStorageDriver(@Path('id') String id)

  @GET('projects/{projectId}/storageDriverService')
  Call<TypeCollection<StorageDriverService>> liststorageDriverServices(@Path('projectId') String projectId)

  @GET('projects/{projectId}/storageDriverService')
  Call<TypeCollection<StorageDriverService>> querystorageDriverServices(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/storageDriverService')
  Call<StorageDriverService> createStorageDriverService(@Path('projectId') String projectId, @Body StorageDriverService storageDriverService)

  @GET('projects/{projectId}/storageDriverService/{id}')
  Call<StorageDriverService> findStorageDriverServiceById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/storageDriverService/{id}')
  Call<StorageDriverService> updateStorageDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body StorageDriverService storageDriverService)

  @DELETE('projects/{projectId}/storageDriverService/{id}')
  Call<StorageDriverService> deleteStorageDriverService(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=rollback')
  Call<Service> rollbackStorageDriverService(@Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=upgrade')
  Call<Service> upgradeStorageDriverService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceUpgrade serviceUpgrade)

  @POST('projects/{projectId}/storageDriverService/{id}?action=restart')
  Call<Service> restartStorageDriverService(@Path('projectId') String projectId, @Path('id') String id, @Body ServiceRestart serviceRestart)

  @POST('projects/{projectId}/storageDriverService/{id}?action=remove')
  Call<Service> removeStorageDriverService(@Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=deactivate')
  Call<Service> deactivateStorageDriverService(@Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=finishupgrade')
  Call<Service> finishupgradeStorageDriverService(@Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=removeservicelink')
  Call<Service> removeservicelinkStorageDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/storageDriverService/{id}?action=continueupgrade')
  Call<Service> continueupgradeStorageDriverService(@Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=activate')
  Call<Service> activateStorageDriverService(@Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=addservicelink')
  Call<Service> addservicelinkStorageDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST('projects/{projectId}/storageDriverService/{id}?action=cancelupgrade')
  Call<Service> cancelupgradeStorageDriverService(@Path('id') String id)

  @POST('projects/{projectId}/storageDriverService/{id}?action=setservicelinks')
  Call<Service> setservicelinksStorageDriverService(
    @Path('projectId') String projectId, @Path('id') String id, @Body SetServiceLinksInput setServiceLinksInput)

  @GET('projects/{projectId}/storagePool')
  Call<TypeCollection<StoragePool>> liststoragePools(@Path('projectId') String projectId)

  @GET('projects/{projectId}/storagePool')
  Call<TypeCollection<StoragePool>> querystoragePools(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/storagePool/{id}')
  Call<StoragePool> findStoragePoolById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/storagePool/{id}?action=activate')
  Call<StoragePool> activateStoragePool(@Path('id') String id)

  @POST('projects/{projectId}/storagePool/{id}?action=purge')
  Call<StoragePool> purgeStoragePool(@Path('id') String id)

  @POST('projects/{projectId}/storagePool/{id}?action=remove')
  Call<StoragePool> removeStoragePool(@Path('id') String id)

  @POST('projects/{projectId}/storagePool/{id}?action=deactivate')
  Call<StoragePool> deactivateStoragePool(@Path('id') String id)

  @GET('projects/{projectId}/subnet')
  Call<TypeCollection<Subnet>> listsubnets(@Path('projectId') String projectId)

  @GET('projects/{projectId}/subnet')
  Call<TypeCollection<Subnet>> querysubnets(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/subnet/{id}')
  Call<Subnet> findSubnetById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/subnet/{id}?action=activate')
  Call<Subnet> activateSubnet(@Path('id') String id)

  @POST('projects/{projectId}/subnet/{id}?action=purge')
  Call<Subnet> purgeSubnet(@Path('id') String id)

  @POST('projects/{projectId}/subnet/{id}?action=remove')
  Call<Subnet> removeSubnet(@Path('id') String id)

  @POST('projects/{projectId}/subnet/{id}?action=deactivate')
  Call<Subnet> deactivateSubnet(@Path('id') String id)

  @POST('projects/{projectId}/targetPortRule')
  Call<TargetPortRule> createTargetPortRule(@Path('projectId') String projectId, @Body TargetPortRule targetPortRule)

  @GET('projects/{projectId}/targetPortRule/{id}')
  Call<TargetPortRule> findTargetPortRuleById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/toServiceUpgradeStrategy')
  Call<ToServiceUpgradeStrategy> createToServiceUpgradeStrategy(
    @Path('projectId') String projectId, @Body ToServiceUpgradeStrategy toServiceUpgradeStrategy)

  @GET('projects/{projectId}/toServiceUpgradeStrategy/{id}')
  Call<ToServiceUpgradeStrategy> findToServiceUpgradeStrategyById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/typeDocumentation')
  Call<TypeCollection<TypeDocumentation>> listtypeDocumentations(@Path('projectId') String projectId)

  @GET('projects/{projectId}/typeDocumentation')
  Call<TypeCollection<TypeDocumentation>> querytypeDocumentations(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @GET('projects/{projectId}/typeDocumentation/{id}')
  Call<TypeDocumentation> findTypeDocumentationById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/ulimit')
  Call<Ulimit> createUlimit(@Path('projectId') String projectId, @Body Ulimit ulimit)

  @GET('projects/{projectId}/ulimit/{id}')
  Call<Ulimit> findUlimitById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/virtualMachine')
  Call<TypeCollection<VirtualMachine>> listvirtualMachines(@Path('projectId') String projectId)

  @GET('projects/{projectId}/virtualMachine')
  Call<TypeCollection<VirtualMachine>> queryvirtualMachines(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/virtualMachine')
  Call<VirtualMachine> createVirtualMachine(@Path('projectId') String projectId, @Body VirtualMachine virtualMachine)

  @GET('projects/{projectId}/virtualMachine/{id}')
  Call<VirtualMachine> findVirtualMachineById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/virtualMachine/{id}')
  Call<VirtualMachine> updateVirtualMachine(@Path('projectId') String projectId, @Path('id') String id, @Body VirtualMachine virtualMachine)

  @DELETE('projects/{projectId}/virtualMachine/{id}')
  Call<VirtualMachine> deleteVirtualMachine(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=updateunhealthy')
  Call<Instance> updateunhealthyVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=console')
  Call<InstanceConsole> consoleVirtualMachine(
    @Path('projectId') String projectId, @Path('id') String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST('projects/{projectId}/virtualMachine/{id}?action=restart')
  Call<Instance> restartVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=deallocate')
  Call<Instance> deallocateVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=start')
  Call<Instance> startVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=updatereinitializing')
  Call<Instance> updatereinitializingVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=purge')
  Call<Instance> purgeVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=error')
  Call<Instance> errorVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=remove')
  Call<Instance> removeVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=stop')
  Call<Instance> stopVirtualMachine(@Path('projectId') String projectId, @Path('id') String id, @Body InstanceStop instanceStop)

  @POST('projects/{projectId}/virtualMachine/{id}?action=allocate')
  Call<Instance> allocateVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=updatehealthy')
  Call<Instance> updatehealthyVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=migrate')
  Call<Instance> migrateVirtualMachine(@Path('id') String id)

  @POST('projects/{projectId}/virtualMachine/{id}?action=logs')
  Call<HostAccess> logsVirtualMachine(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerLogs containerLogs)

  @POST('projects/{projectId}/virtualMachine/{id}?action=execute')
  Call<HostAccess> executeVirtualMachine(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerExec containerExec)

  @POST('projects/{projectId}/virtualMachine/{id}?action=proxy')
  Call<HostAccess> proxyVirtualMachine(@Path('projectId') String projectId, @Path('id') String id, @Body ContainerProxy containerProxy)

  @POST('projects/{projectId}/virtualMachineDisk')
  Call<VirtualMachineDisk> createVirtualMachineDisk(@Path('projectId') String projectId, @Body VirtualMachineDisk virtualMachineDisk)

  @GET('projects/{projectId}/virtualMachineDisk/{id}')
  Call<VirtualMachineDisk> findVirtualMachineDiskById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/volume')
  Call<TypeCollection<Volume>> listvolumes(@Path('projectId') String projectId)

  @GET('projects/{projectId}/volume')
  Call<TypeCollection<Volume>> queryvolumes(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/volume')
  Call<Volume> createVolume(@Path('projectId') String projectId, @Body Volume volume)

  @GET('projects/{projectId}/volume/{id}')
  Call<Volume> findVolumeById(@Path('projectId') String projectId, @Path('id') String id)

  @PUT('projects/{projectId}/volume/{id}')
  Call<Volume> updateVolume(@Path('projectId') String projectId, @Path('id') String id, @Body Volume volume)

  @DELETE('projects/{projectId}/volume/{id}')
  Call<Volume> deleteVolume(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/volume/{id}?action=allocate')
  Call<Volume> allocateVolume(@Path('id') String id)

  @POST('projects/{projectId}/volume/{id}?action=restorefrombackup')
  Call<Volume> restorefrombackupVolume(
    @Path('projectId') String projectId, @Path('id') String id, @Body RestoreFromBackupInput restoreFromBackupInput)

  @POST('projects/{projectId}/volume/{id}?action=deallocate')
  Call<Volume> deallocateVolume(@Path('id') String id)

  @POST('projects/{projectId}/volume/{id}?action=purge')
  Call<Volume> purgeVolume(@Path('id') String id)

  @POST('projects/{projectId}/volume/{id}?action=remove')
  Call<Volume> removeVolume(@Path('id') String id)

  @POST('projects/{projectId}/volume/{id}?action=reverttosnapshot')
  Call<Volume> reverttosnapshotVolume(@Path('projectId') String projectId, @Path('id') String id, @Body RevertToSnapshotInput revertToSnapshotInput)

  @POST('projects/{projectId}/volume/{id}?action=snapshot')
  Call<Snapshot> snapshotVolume(@Path('projectId') String projectId, @Path('id') String id, @Body VolumeSnapshotInput volumeSnapshotInput)

  @POST('projects/{projectId}/volumeActivateInput')
  Call<VolumeActivateInput> createVolumeActivateInput(@Path('projectId') String projectId, @Body VolumeActivateInput volumeActivateInput)

  @GET('projects/{projectId}/volumeActivateInput/{id}')
  Call<VolumeActivateInput> findVolumeActivateInputById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/volumeSnapshotInput/{id}')
  Call<VolumeSnapshotInput> findVolumeSnapshotInputById(@Path('projectId') String projectId, @Path('id') String id)

  @GET('projects/{projectId}/volumeTemplate')
  Call<TypeCollection<VolumeTemplate>> listvolumeTemplates(@Path('projectId') String projectId)

  @GET('projects/{projectId}/volumeTemplate')
  Call<TypeCollection<VolumeTemplate>> queryvolumeTemplates(@Path('projectId') String projectId, @QueryMap Map<String, String> filters)

  @POST('projects/{projectId}/volumeTemplate')
  Call<VolumeTemplate> createVolumeTemplate(@Path('projectId') String projectId, @Body VolumeTemplate volumeTemplate)

  @GET('projects/{projectId}/volumeTemplate/{id}')
  Call<VolumeTemplate> findVolumeTemplateById(@Path('projectId') String projectId, @Path('id') String id)

  @POST('projects/{projectId}/volumeTemplate/{id}?action=activate')
  Call<VolumeTemplate> activateVolumeTemplate(@Path('id') String id)

  @POST('projects/{projectId}/volumeTemplate/{id}?action=purge')
  Call<VolumeTemplate> purgeVolumeTemplate(@Path('id') String id)

  @POST('projects/{projectId}/volumeTemplate/{id}?action=remove')
  Call<VolumeTemplate> removeVolumeTemplate(@Path('id') String id)

  @POST('projects/{projectId}/volumeTemplate/{id}?action=deactivate')
  Call<VolumeTemplate> deactivateVolumeTemplate(@Path('id') String id)

}
