package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.StackUpgrade
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface StackUpgradeApi {
  @GET("projects/{projectId}/stackUpgrade")
  Call<TypeCollection<StackUpgrade>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/stackUpgrade")
  Call<TypeCollection<StackUpgrade>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/stackUpgrade/{id}")
  Call<StackUpgrade> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stackUpgrade")
  Call<StackUpgrade> create(@Path("projectId") String projectId, @Body StackUpgrade stackUpgrade)

  @PUT("projects/{projectId}/stackUpgrade/{id}")
  Call<StackUpgrade> update(@Path("projectId") String projectId, @Path("id") String id, @Body StackUpgrade stackUpgrade)

  @DELETE("projects/{projectId}/stackUpgrade/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
