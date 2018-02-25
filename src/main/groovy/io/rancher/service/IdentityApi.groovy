package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Identity
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface IdentityApi {
  @GET("projects/{projectId}/identity")
  Call<TypeCollection<Identity>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/identity")
  Call<TypeCollection<Identity>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/identity/{id}")
  Call<Identity> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/identity")
  Call<Identity> create(@Path("projectId") String projectId, @Body Identity identity)

  @PUT("projects/{projectId}/identity/{id}")
  Call<Identity> update(@Path("projectId") String projectId, @Path("id") String id, @Body Identity identity)

  @DELETE("projects/{projectId}/identity/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
