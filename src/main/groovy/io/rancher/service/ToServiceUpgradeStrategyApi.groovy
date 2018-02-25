package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ToServiceUpgradeStrategy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ToServiceUpgradeStrategyApi {
  @GET("projects/{projectId}/toServiceUpgradeStrategy")
  Call<TypeCollection<ToServiceUpgradeStrategy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/toServiceUpgradeStrategy")
  Call<TypeCollection<ToServiceUpgradeStrategy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/toServiceUpgradeStrategy/{id}")
  Call<ToServiceUpgradeStrategy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/toServiceUpgradeStrategy")
  Call<ToServiceUpgradeStrategy> create(@Path("projectId") String projectId, @Body ToServiceUpgradeStrategy toServiceUpgradeStrategy)

  @PUT("projects/{projectId}/toServiceUpgradeStrategy/{id}")
  Call<ToServiceUpgradeStrategy> update(@Path("projectId") String projectId, @Path("id") String id, @Body ToServiceUpgradeStrategy toServiceUpgradeStrategy)

  @DELETE("projects/{projectId}/toServiceUpgradeStrategy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
