package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.DigitaloceanConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DigitaloceanConfigApi {
  @GET("projects/{projectId}/digitaloceanConfig")
  Call<TypeCollection<DigitaloceanConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/digitaloceanConfig")
  Call<TypeCollection<DigitaloceanConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/digitaloceanConfig/{id}")
  Call<DigitaloceanConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/digitaloceanConfig")
  Call<DigitaloceanConfig> create(@Path("projectId") String projectId, @Body DigitaloceanConfig digitaloceanConfig)

  @PUT("projects/{projectId}/digitaloceanConfig/{id}")
  Call<DigitaloceanConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body DigitaloceanConfig digitaloceanConfig)

  @DELETE("projects/{projectId}/digitaloceanConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
