package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ScalePolicy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ScalePolicyApi {
  @GET("projects/{projectId}/scalePolicy")
  Call<TypeCollection<ScalePolicy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/scalePolicy")
  Call<TypeCollection<ScalePolicy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/scalePolicy/{id}")
  Call<ScalePolicy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/scalePolicy")
  Call<ScalePolicy> create(@Path("projectId") String projectId, @Body ScalePolicy scalePolicy)

  @PUT("projects/{projectId}/scalePolicy/{id}")
  Call<ScalePolicy> update(@Path("projectId") String projectId, @Path("id") String id, @Body ScalePolicy scalePolicy)

  @DELETE("projects/{projectId}/scalePolicy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
