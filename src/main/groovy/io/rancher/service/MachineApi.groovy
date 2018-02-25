package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Machine
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

interface MachineApi {
  @GET("projects/{projectId}/machine")
  Call<TypeCollection<Machine>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/machine")
  Call<TypeCollection<Machine>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/machine/{id}")
  Call<Machine> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/machine")
  Call<Machine> create(@Path("projectId") String projectId, @Body Machine machine)

  @PUT("projects/{projectId}/machine/{id}")
  Call<Machine> update(@Path("projectId") String projectId, @Path("id") String id, @Body Machine machine)

  @DELETE("projects/{projectId}/machine/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/machine/{id}?action=bootstrap")
  Call<PhysicalHost> bootstrap(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/machine/{id}?action=error")
  Call<PhysicalHost> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/machine/{id}?action=remove")
  Call<PhysicalHost> remove(@Path("projectId") String projectId, @Path("id") String id)
}
