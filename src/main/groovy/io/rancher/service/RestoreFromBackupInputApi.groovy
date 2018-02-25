package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.RestoreFromBackupInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RestoreFromBackupInputApi {
  @GET("projects/{projectId}/restoreFromBackupInput")
  Call<TypeCollection<RestoreFromBackupInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/restoreFromBackupInput")
  Call<TypeCollection<RestoreFromBackupInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/restoreFromBackupInput/{id}")
  Call<RestoreFromBackupInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/restoreFromBackupInput")
  Call<RestoreFromBackupInput> create(@Path("projectId") String projectId, @Body RestoreFromBackupInput restoreFromBackupInput)

  @PUT("projects/{projectId}/restoreFromBackupInput/{id}")
  Call<RestoreFromBackupInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body RestoreFromBackupInput restoreFromBackupInput)

  @DELETE("projects/{projectId}/restoreFromBackupInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
