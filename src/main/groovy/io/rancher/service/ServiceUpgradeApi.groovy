package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceUpgrade
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceUpgradeApi {
  @GET("projects/{projectId}/serviceUpgrade")
  Call<TypeCollection<ServiceUpgrade>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceUpgrade")
  Call<TypeCollection<ServiceUpgrade>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceUpgrade/{id}")
  Call<ServiceUpgrade> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceUpgrade")
  Call<ServiceUpgrade> create(@Path("projectId") String projectId, @Body ServiceUpgrade serviceUpgrade)

  @PUT("projects/{projectId}/serviceUpgrade/{id}")
  Call<ServiceUpgrade> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgrade serviceUpgrade)

  @DELETE("projects/{projectId}/serviceUpgrade/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
