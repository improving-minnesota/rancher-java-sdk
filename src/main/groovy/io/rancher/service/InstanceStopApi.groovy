package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.InstanceStop
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InstanceStopApi {
  @GET("projects/{projectId}/instanceStop")
  Call<TypeCollection<InstanceStop>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/instanceStop")
  Call<TypeCollection<InstanceStop>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/instanceStop/{id}")
  Call<InstanceStop> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/instanceStop")
  Call<InstanceStop> create(@Path("projectId") String projectId, @Body InstanceStop instanceStop)

  @PUT("projects/{projectId}/instanceStop/{id}")
  Call<InstanceStop> update(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceStop instanceStop)

  @DELETE("projects/{projectId}/instanceStop/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
