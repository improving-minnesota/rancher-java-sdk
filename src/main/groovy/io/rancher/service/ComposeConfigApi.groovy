package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ComposeConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ComposeConfigApi {
  @GET("projects/{projectId}/composeConfig")
  Call<TypeCollection<ComposeConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/composeConfig")
  Call<TypeCollection<ComposeConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/composeConfig/{id}")
  Call<ComposeConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeConfig")
  Call<ComposeConfig> create(@Path("projectId") String projectId, @Body ComposeConfig composeConfig)

  @PUT("projects/{projectId}/composeConfig/{id}")
  Call<ComposeConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body ComposeConfig composeConfig)

  @DELETE("projects/{projectId}/composeConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
