package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ContainerExec
import io.rancher.type.ContainerProxy
import io.rancher.type.HostAccess
import io.rancher.type.Instance
import io.rancher.type.InstanceConsole
import io.rancher.type.InstanceConsoleInput
import io.rancher.type.InstanceStop
import io.rancher.type.LaunchConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LaunchConfigApi {
  @GET("projects/{projectId}/launchConfig")
  Call<TypeCollection<LaunchConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/launchConfig")
  Call<TypeCollection<LaunchConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/launchConfig/{id}")
  Call<LaunchConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig")
  Call<LaunchConfig> create(@Path("projectId") String projectId, @Body LaunchConfig launchConfig)

  @PUT("projects/{projectId}/launchConfig/{id}")
  Call<LaunchConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body LaunchConfig launchConfig)

  @DELETE("projects/{projectId}/launchConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=allocate")
  Call<Instance> allocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=console")
  Call<InstanceConsole> console(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST("projects/{projectId}/launchConfig/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=error")
  Call<Instance> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=execute")
  Call<HostAccess> execute(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerExec containerExec)

  @POST("projects/{projectId}/launchConfig/{id}?action=migrate")
  Call<Instance> migrate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=proxy")
  Call<HostAccess> proxy(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerProxy containerProxy)

  @POST("projects/{projectId}/launchConfig/{id}?action=purge")
  Call<Instance> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=remove")
  Call<Instance> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=restart")
  Call<Instance> restart(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=start")
  Call<Instance> start(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=stop")
  Call<Instance> stop(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceStop instanceStop)

  @POST("projects/{projectId}/launchConfig/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/launchConfig/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("projectId") String projectId, @Path("id") String id)
}
