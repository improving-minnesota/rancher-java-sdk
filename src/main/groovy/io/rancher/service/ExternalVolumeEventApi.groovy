package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import io.rancher.type.ExternalVolumeEvent
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalVolumeEventApi {
  @GET("projects/{projectId}/externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/externalVolumeEvent/{id}")
  Call<ExternalVolumeEvent> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalVolumeEvent")
  Call<ExternalVolumeEvent> create(@Path("projectId") String projectId, @Body ExternalVolumeEvent externalVolumeEvent)

  @PUT("projects/{projectId}/externalVolumeEvent/{id}")
  Call<ExternalVolumeEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ExternalVolumeEvent externalVolumeEvent)

  @DELETE("projects/{projectId}/externalVolumeEvent/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalVolumeEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("projectId") String projectId, @Path("id") String id)
}
