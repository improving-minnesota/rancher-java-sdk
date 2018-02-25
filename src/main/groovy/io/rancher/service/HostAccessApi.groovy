package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.HostAccess
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HostAccessApi {
  @GET("projects/{projectId}/hostAccess")
  Call<TypeCollection<HostAccess>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/hostAccess")
  Call<TypeCollection<HostAccess>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/hostAccess/{id}")
  Call<HostAccess> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/hostAccess")
  Call<HostAccess> create(@Path("projectId") String projectId, @Body HostAccess hostAccess)

  @PUT("projects/{projectId}/hostAccess/{id}")
  Call<HostAccess> update(@Path("projectId") String projectId, @Path("id") String id, @Body HostAccess hostAccess)

  @DELETE("projects/{projectId}/hostAccess/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
