package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
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

interface InstanceApi {
  @GET("projects/{projectId}/instance")
  Call<TypeCollection<Instance>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/instance")
  Call<TypeCollection<Instance>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/instance/{id}")
  Call<Instance> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance")
  Call<Instance> create(@Path("projectId") String projectId, @Body Instance instance)

  @PUT("projects/{projectId}/instance/{id}")
  Call<Instance> update(@Path("projectId") String projectId, @Path("id") String id, @Body Instance instance)

  @DELETE("projects/{projectId}/instance/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=allocate")
  Call<Instance> allocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=console")
  Call<InstanceConsole> console(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput)

  @POST("projects/{projectId}/instance/{id}?action=deallocate")
  Call<Instance> deallocate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=error")
  Call<Instance> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=migrate")
  Call<Instance> migrate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=purge")
  Call<Instance> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=remove")
  Call<Instance> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=restart")
  Call<Instance> restart(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=start")
  Call<Instance> start(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=stop")
  Call<Instance> stop(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceStop instanceStop)

  @POST("projects/{projectId}/instance/{id}?action=updatehealthy")
  Call<Instance> updatehealthy(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=updatereinitializing")
  Call<Instance> updatereinitializing(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instance/{id}?action=updateunhealthy")
  Call<Instance> updateunhealthy(@Path("projectId") String projectId, @Path("id") String id)
}
