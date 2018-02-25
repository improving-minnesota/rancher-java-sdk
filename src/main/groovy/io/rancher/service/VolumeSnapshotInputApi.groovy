package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.VolumeSnapshotInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface VolumeSnapshotInputApi {
  @GET("projects/{projectId}/volumeSnapshotInput")
  Call<TypeCollection<VolumeSnapshotInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/volumeSnapshotInput")
  Call<TypeCollection<VolumeSnapshotInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/volumeSnapshotInput/{id}")
  Call<VolumeSnapshotInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/volumeSnapshotInput")
  Call<VolumeSnapshotInput> create(@Path("projectId") String projectId, @Body VolumeSnapshotInput volumeSnapshotInput)

  @PUT("projects/{projectId}/volumeSnapshotInput/{id}")
  Call<VolumeSnapshotInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body VolumeSnapshotInput volumeSnapshotInput)

  @DELETE("projects/{projectId}/volumeSnapshotInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
