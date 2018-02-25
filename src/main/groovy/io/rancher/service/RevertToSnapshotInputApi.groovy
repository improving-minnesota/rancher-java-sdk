package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.RevertToSnapshotInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RevertToSnapshotInputApi {
  @GET("projects/{projectId}/revertToSnapshotInput")
  Call<TypeCollection<RevertToSnapshotInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/revertToSnapshotInput")
  Call<TypeCollection<RevertToSnapshotInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/revertToSnapshotInput/{id}")
  Call<RevertToSnapshotInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/revertToSnapshotInput")
  Call<RevertToSnapshotInput> create(@Path("projectId") String projectId, @Body RevertToSnapshotInput revertToSnapshotInput)

  @PUT("projects/{projectId}/revertToSnapshotInput/{id}")
  Call<RevertToSnapshotInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body RevertToSnapshotInput revertToSnapshotInput)

  @DELETE("projects/{projectId}/revertToSnapshotInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
