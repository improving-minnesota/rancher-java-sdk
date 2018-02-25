package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ExternalDnsEvent
import io.rancher.type.ExternalEvent
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalDnsEventApi {
  @GET("projects/{projectId}/externalDnsEvent")
  Call<TypeCollection<ExternalDnsEvent>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/externalDnsEvent")
  Call<TypeCollection<ExternalDnsEvent>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/externalDnsEvent/{id}")
  Call<ExternalDnsEvent> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalDnsEvent")
  Call<ExternalDnsEvent> create(@Path("projectId") String projectId, @Body ExternalDnsEvent externalDnsEvent)

  @PUT("projects/{projectId}/externalDnsEvent/{id}")
  Call<ExternalDnsEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ExternalDnsEvent externalDnsEvent)

  @DELETE("projects/{projectId}/externalDnsEvent/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalDnsEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("projectId") String projectId, @Path("id") String id)
}
