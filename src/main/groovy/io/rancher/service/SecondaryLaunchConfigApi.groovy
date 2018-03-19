package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.SecondaryLaunchConfig
import io.rancher.type.Instance
import io.rancher.type.InstanceConsoleInput
import io.rancher.type.InstanceConsole
import io.rancher.type.InstanceStop
import io.rancher.type.ContainerExec
import io.rancher.type.HostAccess
import io.rancher.type.ContainerProxy
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SecondaryLaunchConfigApi {

  @POST('secondaryLaunchConfigs')
  Call<SecondaryLaunchConfig> create(@Body SecondaryLaunchConfig secondaryLaunchConfig)

  @GET('secondaryLaunchConfigs/{id}')
  Call<SecondaryLaunchConfig> findById(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=updateunhealthy')
  Call<Instance> updateunhealthy(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=console')
  Call<InstanceConsole> console(@Path('id') String id, @Body InstanceConsoleInput instanceConsoleInput)
  @POST('secondaryLaunchConfigs/{id}?action=restart')
  Call<Instance> restart(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=deallocate')
  Call<Instance> deallocate(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=start')
  Call<Instance> start(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=updatereinitializing')
  Call<Instance> updatereinitializing(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=purge')
  Call<Instance> purge(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=error')
  Call<Instance> error(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=remove')
  Call<Instance> remove(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=stop')
  Call<Instance> stop(@Path('id') String id, @Body InstanceStop instanceStop)
  @POST('secondaryLaunchConfigs/{id}?action=allocate')
  Call<Instance> allocate(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=updatehealthy')
  Call<Instance> updatehealthy(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=migrate')
  Call<Instance> migrate(@Path('id') String id)

  @POST('secondaryLaunchConfigs/{id}?action=execute')
  Call<HostAccess> execute(@Path('id') String id, @Body ContainerExec containerExec)
  @POST('secondaryLaunchConfigs/{id}?action=proxy')
  Call<HostAccess> proxy(@Path('id') String id, @Body ContainerProxy containerProxy)
}
