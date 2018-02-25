package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Backup
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface BackupApi {
  @GET("projects/{projectId}/backup")
  Call<TypeCollection<Backup>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/backup")
  Call<TypeCollection<Backup>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/backup/{id}")
  Call<Backup> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/backup")
  Call<Backup> create(@Path("projectId") String projectId, @Body Backup backup)

  @PUT("projects/{projectId}/backup/{id}")
  Call<Backup> update(@Path("projectId") String projectId, @Path("id") String id, @Body Backup backup)

  @DELETE("projects/{projectId}/backup/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/backup/{id}?action=remove")
  Call<Backup> remove(@Path("projectId") String projectId, @Path("id") String id)
}
