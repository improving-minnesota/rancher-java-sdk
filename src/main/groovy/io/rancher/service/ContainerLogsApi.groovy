package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ContainerLogs
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ContainerLogsApi {
  @GET("projects/{projectId}/containerLogs")
  Call<TypeCollection<ContainerLogs>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/containerLogs")
  Call<TypeCollection<ContainerLogs>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/containerLogs/{id}")
  Call<ContainerLogs> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/containerLogs")
  Call<ContainerLogs> create(@Path("projectId") String projectId, @Body ContainerLogs containerLogs)

  @PUT("projects/{projectId}/containerLogs/{id}")
  Call<ContainerLogs> update(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerLogs containerLogs)

  @DELETE("projects/{projectId}/containerLogs/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
