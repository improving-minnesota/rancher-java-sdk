package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.BaseMachineConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface BaseMachineConfigApi {
  @GET("projects/{projectId}/baseMachineConfig")
  Call<TypeCollection<BaseMachineConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/baseMachineConfig")
  Call<TypeCollection<BaseMachineConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/baseMachineConfig/{id}")
  Call<BaseMachineConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/baseMachineConfig")
  Call<BaseMachineConfig> create(@Path("projectId") String projectId, @Body BaseMachineConfig baseMachineConfig)

  @PUT("projects/{projectId}/baseMachineConfig/{id}")
  Call<BaseMachineConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body BaseMachineConfig baseMachineConfig)

  @DELETE("projects/{projectId}/baseMachineConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
