package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ComposeConfigInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ComposeConfigInputApi {
  @GET("projects/{projectId}/composeConfigInput")
  Call<TypeCollection<ComposeConfigInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/composeConfigInput")
  Call<TypeCollection<ComposeConfigInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/composeConfigInput/{id}")
  Call<ComposeConfigInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeConfigInput")
  Call<ComposeConfigInput> create(@Path("projectId") String projectId, @Body ComposeConfigInput composeConfigInput)

  @PUT("projects/{projectId}/composeConfigInput/{id}")
  Call<ComposeConfigInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body ComposeConfigInput composeConfigInput)

  @DELETE("projects/{projectId}/composeConfigInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
