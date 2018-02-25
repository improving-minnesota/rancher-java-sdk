package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import io.rancher.type.ExternalStoragePoolEvent
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalStoragePoolEventApi {
  @GET("projects/{projectId}/externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/externalStoragePoolEvent/{id}")
  Call<ExternalStoragePoolEvent> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalStoragePoolEvent")
  Call<ExternalStoragePoolEvent> create(@Path("projectId") String projectId, @Body ExternalStoragePoolEvent externalStoragePoolEvent)

  @PUT("projects/{projectId}/externalStoragePoolEvent/{id}")
  Call<ExternalStoragePoolEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ExternalStoragePoolEvent externalStoragePoolEvent)

  @DELETE("projects/{projectId}/externalStoragePoolEvent/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalStoragePoolEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("projectId") String projectId, @Path("id") String id)
}
