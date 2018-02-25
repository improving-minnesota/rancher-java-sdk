package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.LbTargetConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LbTargetConfigApi {
  @GET("projects/{projectId}/lbTargetConfig")
  Call<TypeCollection<LbTargetConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/lbTargetConfig")
  Call<TypeCollection<LbTargetConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/lbTargetConfig/{id}")
  Call<LbTargetConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/lbTargetConfig")
  Call<LbTargetConfig> create(@Path("projectId") String projectId, @Body LbTargetConfig lbTargetConfig)

  @PUT("projects/{projectId}/lbTargetConfig/{id}")
  Call<LbTargetConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body LbTargetConfig lbTargetConfig)

  @DELETE("projects/{projectId}/lbTargetConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
