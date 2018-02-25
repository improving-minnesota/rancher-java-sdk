package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.InstanceConsoleInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InstanceConsoleInputApi {
  @GET("projects/{projectId}/instanceConsoleInput")
  Call<TypeCollection<InstanceConsoleInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/instanceConsoleInput")
  Call<TypeCollection<InstanceConsoleInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/instanceConsoleInput/{id}")
  Call<InstanceConsoleInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instanceConsoleInput")
  Call<InstanceConsoleInput> create(@Path("projectId") String projectId, @Body InstanceConsoleInput instanceConsoleInput)

  @PUT("projects/{projectId}/instanceConsoleInput/{id}")
  Call<InstanceConsoleInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput)

  @DELETE("projects/{projectId}/instanceConsoleInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
