package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceUpgradeStrategy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceUpgradeStrategyApi {
  @GET("projects/{projectId}/serviceUpgradeStrategy")
  Call<TypeCollection<ServiceUpgradeStrategy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceUpgradeStrategy")
  Call<TypeCollection<ServiceUpgradeStrategy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceUpgradeStrategy/{id}")
  Call<ServiceUpgradeStrategy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceUpgradeStrategy")
  Call<ServiceUpgradeStrategy> create(@Path("projectId") String projectId, @Body ServiceUpgradeStrategy serviceUpgradeStrategy)

  @PUT("projects/{projectId}/serviceUpgradeStrategy/{id}")
  Call<ServiceUpgradeStrategy> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgradeStrategy serviceUpgradeStrategy)

  @DELETE("projects/{projectId}/serviceUpgradeStrategy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
