package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Amazonec2Config
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface Amazonec2ConfigApi {
  @GET("projects/{projectId}/amazonec2Config")
  Call<TypeCollection<Amazonec2Config>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/amazonec2Config")
  Call<TypeCollection<Amazonec2Config>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/amazonec2Config/{id}")
  Call<Amazonec2Config> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/amazonec2Config")
  Call<Amazonec2Config> create(@Path("projectId") String projectId, @Body Amazonec2Config amazonec2Config)

  @PUT("projects/{projectId}/amazonec2Config/{id}")
  Call<Amazonec2Config> update(@Path("projectId") String projectId, @Path("id") String id, @Body Amazonec2Config amazonec2Config)

  @DELETE("projects/{projectId}/amazonec2Config/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
