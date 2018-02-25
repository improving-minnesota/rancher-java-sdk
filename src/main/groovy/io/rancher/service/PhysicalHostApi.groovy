package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.PhysicalHost
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PhysicalHostApi {
  @GET("projects/{projectId}/physicalHost")
  Call<TypeCollection<PhysicalHost>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/physicalHost")
  Call<TypeCollection<PhysicalHost>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/physicalHost/{id}")
  Call<PhysicalHost> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/physicalHost")
  Call<PhysicalHost> create(@Path("projectId") String projectId, @Body PhysicalHost physicalHost)

  @PUT("projects/{projectId}/physicalHost/{id}")
  Call<PhysicalHost> update(@Path("projectId") String projectId, @Path("id") String id, @Body PhysicalHost physicalHost)

  @DELETE("projects/{projectId}/physicalHost/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/physicalHost/{id}?action=bootstrap")
  Call<PhysicalHost> bootstrap(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/physicalHost/{id}?action=error")
  Call<PhysicalHost> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/physicalHost/{id}?action=remove")
  Call<PhysicalHost> remove(@Path("projectId") String projectId, @Path("id") String id)
}
