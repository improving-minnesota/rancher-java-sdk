package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.VolumeActivateInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface VolumeActivateInputApi {
  @GET("projects/{projectId}/volumeActivateInput")
  Call<TypeCollection<VolumeActivateInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/volumeActivateInput")
  Call<TypeCollection<VolumeActivateInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/volumeActivateInput/{id}")
  Call<VolumeActivateInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/volumeActivateInput")
  Call<VolumeActivateInput> create(@Path("projectId") String projectId, @Body VolumeActivateInput volumeActivateInput)

  @PUT("projects/{projectId}/volumeActivateInput/{id}")
  Call<VolumeActivateInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body VolumeActivateInput volumeActivateInput)

  @DELETE("projects/{projectId}/volumeActivateInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
