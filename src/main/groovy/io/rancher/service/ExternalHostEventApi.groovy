package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import io.rancher.type.ExternalHostEvent
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalHostEventApi {
  @GET("projects/{projectId}/externalHostEvent")
  Call<TypeCollection<ExternalHostEvent>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/externalHostEvent")
  Call<TypeCollection<ExternalHostEvent>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/externalHostEvent/{id}")
  Call<ExternalHostEvent> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalHostEvent")
  Call<ExternalHostEvent> create(@Path("projectId") String projectId, @Body ExternalHostEvent externalHostEvent)

  @PUT("projects/{projectId}/externalHostEvent/{id}")
  Call<ExternalHostEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ExternalHostEvent externalHostEvent)

  @DELETE("projects/{projectId}/externalHostEvent/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalHostEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("projectId") String projectId, @Path("id") String id)
}
