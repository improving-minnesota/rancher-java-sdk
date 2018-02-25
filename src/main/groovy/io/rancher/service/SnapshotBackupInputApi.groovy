package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.SnapshotBackupInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SnapshotBackupInputApi {
  @GET("projects/{projectId}/snapshotBackupInput")
  Call<TypeCollection<SnapshotBackupInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/snapshotBackupInput")
  Call<TypeCollection<SnapshotBackupInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/snapshotBackupInput/{id}")
  Call<SnapshotBackupInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/snapshotBackupInput")
  Call<SnapshotBackupInput> create(@Path("projectId") String projectId, @Body SnapshotBackupInput snapshotBackupInput)

  @PUT("projects/{projectId}/snapshotBackupInput/{id}")
  Call<SnapshotBackupInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body SnapshotBackupInput snapshotBackupInput)

  @DELETE("projects/{projectId}/snapshotBackupInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
