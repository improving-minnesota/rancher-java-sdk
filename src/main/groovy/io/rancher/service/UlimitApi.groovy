package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Ulimit
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface UlimitApi {
  @GET("projects/{projectId}/ulimit")
  Call<TypeCollection<Ulimit>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/ulimit")
  Call<TypeCollection<Ulimit>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/ulimit/{id}")
  Call<Ulimit> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ulimit")
  Call<Ulimit> create(@Path("projectId") String projectId, @Body Ulimit ulimit)

  @PUT("projects/{projectId}/ulimit/{id}")
  Call<Ulimit> update(@Path("projectId") String projectId, @Path("id") String id, @Body Ulimit ulimit)

  @DELETE("projects/{projectId}/ulimit/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
