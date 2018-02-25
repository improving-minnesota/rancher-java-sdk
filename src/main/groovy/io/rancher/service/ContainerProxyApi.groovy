package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ContainerProxy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ContainerProxyApi {
  @GET("projects/{projectId}/containerProxy")
  Call<TypeCollection<ContainerProxy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/containerProxy")
  Call<TypeCollection<ContainerProxy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/containerProxy/{id}")
  Call<ContainerProxy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/containerProxy")
  Call<ContainerProxy> create(@Path("projectId") String projectId, @Body ContainerProxy containerProxy)

  @PUT("projects/{projectId}/containerProxy/{id}")
  Call<ContainerProxy> update(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerProxy containerProxy)

  @DELETE("projects/{projectId}/containerProxy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
