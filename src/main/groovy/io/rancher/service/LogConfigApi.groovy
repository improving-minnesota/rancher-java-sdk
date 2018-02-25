package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.LogConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LogConfigApi {
  @GET("projects/{projectId}/logConfig")
  Call<TypeCollection<LogConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/logConfig")
  Call<TypeCollection<LogConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/logConfig/{id}")
  Call<LogConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/logConfig")
  Call<LogConfig> create(@Path("projectId") String projectId, @Body LogConfig logConfig)

  @PUT("projects/{projectId}/logConfig/{id}")
  Call<LogConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body LogConfig logConfig)

  @DELETE("projects/{projectId}/logConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
