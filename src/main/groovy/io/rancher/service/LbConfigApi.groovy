package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.LbConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LbConfigApi {
  @GET("projects/{projectId}/lbConfig")
  Call<TypeCollection<LbConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/lbConfig")
  Call<TypeCollection<LbConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/lbConfig/{id}")
  Call<LbConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/lbConfig")
  Call<LbConfig> create(@Path("projectId") String projectId, @Body LbConfig lbConfig)

  @PUT("projects/{projectId}/lbConfig/{id}")
  Call<LbConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body LbConfig lbConfig)

  @DELETE("projects/{projectId}/lbConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
