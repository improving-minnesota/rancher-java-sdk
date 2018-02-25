package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceEvent
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceEventApi {
  @GET("projects/{projectId}/serviceEvent")
  Call<TypeCollection<ServiceEvent>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceEvent")
  Call<TypeCollection<ServiceEvent>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceEvent/{id}")
  Call<ServiceEvent> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceEvent")
  Call<ServiceEvent> create(@Path("projectId") String projectId, @Body ServiceEvent serviceEvent)

  @PUT("projects/{projectId}/serviceEvent/{id}")
  Call<ServiceEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceEvent serviceEvent)

  @DELETE("projects/{projectId}/serviceEvent/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceEvent/{id}?action=remove")
  Call<ServiceEvent> remove(@Path("projectId") String projectId, @Path("id") String id)
}
