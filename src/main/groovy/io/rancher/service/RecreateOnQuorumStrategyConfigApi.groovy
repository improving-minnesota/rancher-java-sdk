package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.RecreateOnQuorumStrategyConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RecreateOnQuorumStrategyConfigApi {
  @GET("projects/{projectId}/recreateOnQuorumStrategyConfig")
  Call<TypeCollection<RecreateOnQuorumStrategyConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/recreateOnQuorumStrategyConfig")
  Call<TypeCollection<RecreateOnQuorumStrategyConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/recreateOnQuorumStrategyConfig/{id}")
  Call<RecreateOnQuorumStrategyConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/recreateOnQuorumStrategyConfig")
  Call<RecreateOnQuorumStrategyConfig> create(@Path("projectId") String projectId, @Body RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig)

  @PUT("projects/{projectId}/recreateOnQuorumStrategyConfig/{id}")
  Call<RecreateOnQuorumStrategyConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig)

  @DELETE("projects/{projectId}/recreateOnQuorumStrategyConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
