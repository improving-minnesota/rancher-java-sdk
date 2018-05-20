package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.VirtualMachine
import io.rancher.type.Instance
import io.rancher.type.InstanceConsoleInput
import io.rancher.type.InstanceConsole
import io.rancher.type.InstanceStop
import io.rancher.type.ContainerLogs
import io.rancher.type.HostAccess
import io.rancher.type.ContainerExec
import io.rancher.type.ContainerProxy
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface VirtualMachineApi {
  @GET('virtualMachines')
  Call<TypeCollection<VirtualMachine>> list()

  @GET('virtualMachines')
  Call<TypeCollection<VirtualMachine>> query(@QueryMap Map<String, String> filters)

  @GET('virtualMachines/{id}')
  Call<VirtualMachine> findById(@Path('id') String id)

  @POST('virtualMachines/{id}?action=updateunhealthy')
  Call<Instance> updateunhealthy(@Path('id') String id)

  @POST('virtualMachines/{id}?action=console')
  Call<InstanceConsole> console(@Path('id') String id, @Body InstanceConsoleInput instanceConsoleInput)
  @POST('virtualMachines/{id}?action=restart')
  Call<Instance> restart(@Path('id') String id)

  @POST('virtualMachines/{id}?action=deallocate')
  Call<Instance> deallocate(@Path('id') String id)

  @POST('virtualMachines/{id}?action=start')
  Call<Instance> start(@Path('id') String id)

  @POST('virtualMachines/{id}?action=updatereinitializing')
  Call<Instance> updatereinitializing(@Path('id') String id)

  @POST('virtualMachines/{id}?action=purge')
  Call<Instance> purge(@Path('id') String id)

  @POST('virtualMachines/{id}?action=error')
  Call<Instance> error(@Path('id') String id)

  @POST('virtualMachines/{id}?action=remove')
  Call<Instance> remove(@Path('id') String id)

  @POST('virtualMachines/{id}?action=stop')
  Call<Instance> stop(@Path('id') String id, @Body InstanceStop instanceStop)
  @POST('virtualMachines/{id}?action=allocate')
  Call<Instance> allocate(@Path('id') String id)

  @POST('virtualMachines/{id}?action=updatehealthy')
  Call<Instance> updatehealthy(@Path('id') String id)

  @POST('virtualMachines/{id}?action=migrate')
  Call<Instance> migrate(@Path('id') String id)

  @POST('virtualMachines/{id}?action=logs')
  Call<HostAccess> logs(@Path('id') String id, @Body ContainerLogs containerLogs)
  @POST('virtualMachines/{id}?action=execute')
  Call<HostAccess> execute(@Path('id') String id, @Body ContainerExec containerExec)
  @POST('virtualMachines/{id}?action=proxy')
  Call<HostAccess> proxy(@Path('id') String id, @Body ContainerProxy containerProxy)
}
