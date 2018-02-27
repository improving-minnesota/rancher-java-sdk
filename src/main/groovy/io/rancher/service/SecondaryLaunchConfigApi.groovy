package io.rancher.service

import io.rancher.type.ContainerExec
import io.rancher.type.ContainerProxy
import io.rancher.type.HostAccess
import io.rancher.type.Instance
import io.rancher.type.InstanceConsole
import io.rancher.type.InstanceConsoleInput
import io.rancher.type.InstanceStop
import io.rancher.type.SecondaryLaunchConfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SecondaryLaunchConfigApi { 

  @POST("secondaryLaunchConfig")
  Call<SecondaryLaunchConfig> create(@Body SecondaryLaunchConfig secondaryLaunchConfig)

  @GET("secondaryLaunchConfig/{id}")
  Call<SecondaryLaunchConfig> findById(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=allocate")
  Call<Instance> allocate(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=console")
  Call<InstanceConsole> console(@Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST("secondaryLaunchConfig/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=error")
  Call<Instance> error(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=execute")
  Call<HostAccess> execute(@Path("id") String id, @Body ContainerExec containerExec)

  @POST("secondaryLaunchConfig/{id}?action=migrate")
  Call<Instance> migrate(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=proxy")
  Call<HostAccess> proxy(@Path("id") String id, @Body ContainerProxy containerProxy)

  @POST("secondaryLaunchConfig/{id}?action=purge")
  Call<Instance> purge(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=remove")
  Call<Instance> remove(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=restart")
  Call<Instance> restart(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=start")
  Call<Instance> start(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=stop")
  Call<Instance> stop(@Path("id") String id, @Body InstanceStop instanceStop)

  @POST("secondaryLaunchConfig/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("id") String id)

  @POST("secondaryLaunchConfig/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("id") String id)
}
