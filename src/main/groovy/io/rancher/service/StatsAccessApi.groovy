package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.StatsAccess
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface StatsAccessApi {
  @GET("projects/{projectId}/statsAccess")
  Call<TypeCollection<StatsAccess>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/statsAccess")
  Call<TypeCollection<StatsAccess>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/statsAccess/{id}")
  Call<StatsAccess> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/statsAccess")
  Call<StatsAccess> create(@Path("projectId") String projectId, @Body StatsAccess statsAccess)

  @PUT("projects/{projectId}/statsAccess/{id}")
  Call<StatsAccess> update(@Path("projectId") String projectId, @Path("id") String id, @Body StatsAccess statsAccess)

  @DELETE("projects/{projectId}/statsAccess/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
