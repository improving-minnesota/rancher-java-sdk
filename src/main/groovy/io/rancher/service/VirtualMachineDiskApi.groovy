package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.VirtualMachineDisk
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface VirtualMachineDiskApi {
  @GET("projects/{projectId}/virtualMachineDisk")
  Call<TypeCollection<VirtualMachineDisk>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/virtualMachineDisk")
  Call<TypeCollection<VirtualMachineDisk>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/virtualMachineDisk/{id}")
  Call<VirtualMachineDisk> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/virtualMachineDisk")
  Call<VirtualMachineDisk> create(@Path("projectId") String projectId, @Body VirtualMachineDisk virtualMachineDisk)

  @PUT("projects/{projectId}/virtualMachineDisk/{id}")
  Call<VirtualMachineDisk> update(@Path("projectId") String projectId, @Path("id") String id, @Body VirtualMachineDisk virtualMachineDisk)

  @DELETE("projects/{projectId}/virtualMachineDisk/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
