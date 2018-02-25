package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.InServiceUpgradeStrategy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InServiceUpgradeStrategyApi {
  @GET("projects/{projectId}/inServiceUpgradeStrategy")
  Call<TypeCollection<InServiceUpgradeStrategy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/inServiceUpgradeStrategy")
  Call<TypeCollection<InServiceUpgradeStrategy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/inServiceUpgradeStrategy/{id}")
  Call<InServiceUpgradeStrategy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/inServiceUpgradeStrategy")
  Call<InServiceUpgradeStrategy> create(@Path("projectId") String projectId, @Body InServiceUpgradeStrategy inServiceUpgradeStrategy)

  @PUT("projects/{projectId}/inServiceUpgradeStrategy/{id}")
  Call<InServiceUpgradeStrategy> update(@Path("projectId") String projectId, @Path("id") String id, @Body InServiceUpgradeStrategy inServiceUpgradeStrategy)

  @DELETE("projects/{projectId}/inServiceUpgradeStrategy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
