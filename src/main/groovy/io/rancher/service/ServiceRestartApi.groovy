package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceRestart
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceRestartApi {
  @GET("projects/{projectId}/serviceRestart")
  Call<TypeCollection<ServiceRestart>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceRestart")
  Call<TypeCollection<ServiceRestart>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceRestart/{id}")
  Call<ServiceRestart> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceRestart")
  Call<ServiceRestart> create(@Path("projectId") String projectId, @Body ServiceRestart serviceRestart)

  @PUT("projects/{projectId}/serviceRestart/{id}")
  Call<ServiceRestart> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceRestart serviceRestart)

  @DELETE("projects/{projectId}/serviceRestart/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
