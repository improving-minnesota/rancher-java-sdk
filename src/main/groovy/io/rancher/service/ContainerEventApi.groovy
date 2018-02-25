package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ContainerEvent
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ContainerEventApi {
  @GET("projects/{projectId}/containerEvent")
  Call<TypeCollection<ContainerEvent>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/containerEvent")
  Call<TypeCollection<ContainerEvent>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/containerEvent/{id}")
  Call<ContainerEvent> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/containerEvent")
  Call<ContainerEvent> create(@Path("projectId") String projectId, @Body ContainerEvent containerEvent)

  @PUT("projects/{projectId}/containerEvent/{id}")
  Call<ContainerEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ContainerEvent containerEvent)

  @DELETE("projects/{projectId}/containerEvent/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/containerEvent/{id}?action=remove")
  Call<ContainerEvent> remove(@Path("projectId") String projectId, @Path("id") String id)
}
