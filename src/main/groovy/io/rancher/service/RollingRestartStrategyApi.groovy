package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.RollingRestartStrategy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RollingRestartStrategyApi {
  @GET("projects/{projectId}/rollingRestartStrategy")
  Call<TypeCollection<RollingRestartStrategy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/rollingRestartStrategy")
  Call<TypeCollection<RollingRestartStrategy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/rollingRestartStrategy/{id}")
  Call<RollingRestartStrategy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/rollingRestartStrategy")
  Call<RollingRestartStrategy> create(@Path("projectId") String projectId, @Body RollingRestartStrategy rollingRestartStrategy)

  @PUT("projects/{projectId}/rollingRestartStrategy/{id}")
  Call<RollingRestartStrategy> update(@Path("projectId") String projectId, @Path("id") String id, @Body RollingRestartStrategy rollingRestartStrategy)

  @DELETE("projects/{projectId}/rollingRestartStrategy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
