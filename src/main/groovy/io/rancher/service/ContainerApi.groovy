package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Container
import io.rancher.type.ContainerExec
import io.rancher.type.ContainerLogs
import io.rancher.type.ContainerProxy
import io.rancher.type.HostAccess
import io.rancher.type.Instance
import io.rancher.type.InstanceConsole
import io.rancher.type.InstanceConsoleInput
import io.rancher.type.InstanceStop
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ContainerApi {
  @GET("projects/{projectId}/container")
  Call<TypeCollection<Container>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/container")
  Call<TypeCollection<Container>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/container/{id}")
  Call<Container> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container")
  Call<Container> create(@Path("projectId") String projectId, @Body Container container)

  @PUT("projects/{projectId}/container/{id}")
  Call<Container> update(@Path("projectId") String projectId, @Path("id") String id, @Body Container container)

  @DELETE("projects/{projectId}/container/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=allocate")
  Call<Instance> allocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=console")
  Call<InstanceConsole> console(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST("projects/{projectId}/container/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=error")
  Call<Instance> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=execute")
  Call<HostAccess> execute(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerExec containerExec)

  @POST("projects/{projectId}/container/{id}?action=logs")
  Call<HostAccess> logs(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerLogs containerLogs)

  @POST("projects/{projectId}/container/{id}?action=migrate")
  Call<Instance> migrate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=proxy")
  Call<HostAccess> proxy(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerProxy containerProxy)

  @POST("projects/{projectId}/container/{id}?action=purge")
  Call<Instance> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=remove")
  Call<Instance> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=restart")
  Call<Instance> restart(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=start")
  Call<Instance> start(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=stop")
  Call<Instance> stop(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceStop instanceStop)

  @POST("projects/{projectId}/container/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/container/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("projectId") String projectId, @Path("id") String id)
}
