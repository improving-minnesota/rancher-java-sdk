package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceProxy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceProxyApi {
  @GET("projects/{projectId}/serviceProxy")
  Call<TypeCollection<ServiceProxy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceProxy")
  Call<TypeCollection<ServiceProxy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceProxy/{id}")
  Call<ServiceProxy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceProxy")
  Call<ServiceProxy> create(@Path("projectId") String projectId, @Body ServiceProxy serviceProxy)

  @PUT("projects/{projectId}/serviceProxy/{id}")
  Call<ServiceProxy> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceProxy serviceProxy)

  @DELETE("projects/{projectId}/serviceProxy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
