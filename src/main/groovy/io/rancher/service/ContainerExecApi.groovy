package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ContainerExec
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ContainerExecApi {
  @GET("projects/{projectId}/containerExec")
  Call<TypeCollection<ContainerExec>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/containerExec")
  Call<TypeCollection<ContainerExec>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/containerExec/{id}")
  Call<ContainerExec> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/containerExec")
  Call<ContainerExec> create(@Path("projectId") String projectId, @Body ContainerExec containerExec)

  @PUT("projects/{projectId}/containerExec/{id}")
  Call<ContainerExec> update(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerExec containerExec)

  @DELETE("projects/{projectId}/containerExec/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
