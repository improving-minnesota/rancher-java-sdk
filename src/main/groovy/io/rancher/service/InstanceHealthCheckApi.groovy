package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.InstanceHealthCheck
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InstanceHealthCheckApi {
  @GET("projects/{projectId}/instanceHealthCheck")
  Call<TypeCollection<InstanceHealthCheck>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/instanceHealthCheck")
  Call<TypeCollection<InstanceHealthCheck>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/instanceHealthCheck/{id}")
  Call<InstanceHealthCheck> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instanceHealthCheck")
  Call<InstanceHealthCheck> create(@Path("projectId") String projectId, @Body InstanceHealthCheck instanceHealthCheck)

  @PUT("projects/{projectId}/instanceHealthCheck/{id}")
  Call<InstanceHealthCheck> update(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceHealthCheck instanceHealthCheck)

  @DELETE("projects/{projectId}/instanceHealthCheck/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
