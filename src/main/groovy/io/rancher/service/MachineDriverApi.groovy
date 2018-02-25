package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.MachineDriver
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface MachineDriverApi {
  @GET("projects/{projectId}/machineDriver")
  Call<TypeCollection<MachineDriver>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/machineDriver")
  Call<TypeCollection<MachineDriver>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/machineDriver/{id}")
  Call<MachineDriver> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/machineDriver")
  Call<MachineDriver> create(@Path("projectId") String projectId, @Body MachineDriver machineDriver)

  @PUT("projects/{projectId}/machineDriver/{id}")
  Call<MachineDriver> update(@Path("projectId") String projectId, @Path("id") String id, @Body MachineDriver machineDriver)

  @DELETE("projects/{projectId}/machineDriver/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
