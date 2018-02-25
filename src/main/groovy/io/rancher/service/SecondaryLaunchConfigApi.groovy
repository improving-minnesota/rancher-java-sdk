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
import io.rancher.type.SecondaryLaunchConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SecondaryLaunchConfigApi {
  @GET("projects/{projectId}/secondaryLaunchConfig")
  Call<TypeCollection<SecondaryLaunchConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/secondaryLaunchConfig")
  Call<TypeCollection<SecondaryLaunchConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/secondaryLaunchConfig/{id}")
  Call<SecondaryLaunchConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig")
  Call<SecondaryLaunchConfig> create(@Path("projectId") String projectId, @Body SecondaryLaunchConfig secondaryLaunchConfig)

  @PUT("projects/{projectId}/secondaryLaunchConfig/{id}")
  Call<SecondaryLaunchConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body SecondaryLaunchConfig secondaryLaunchConfig)

  @DELETE("projects/{projectId}/secondaryLaunchConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=allocate")
  Call<Instance> allocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=console")
  Call<InstanceConsole> console(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=error")
  Call<Instance> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=execute")
  Call<HostAccess> execute(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerExec containerExec)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=migrate")
  Call<Instance> migrate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=proxy")
  Call<HostAccess> proxy(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerProxy containerProxy)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=purge")
  Call<Instance> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=remove")
  Call<Instance> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=restart")
  Call<Instance> restart(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=start")
  Call<Instance> start(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=stop")
  Call<Instance> stop(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceStop instanceStop)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secondaryLaunchConfig/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("projectId") String projectId, @Path("id") String id)
}
