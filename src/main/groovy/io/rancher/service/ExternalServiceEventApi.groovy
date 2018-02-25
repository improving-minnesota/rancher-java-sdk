package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import io.rancher.type.ExternalServiceEvent
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalServiceEventApi {
  @GET("projects/{projectId}/externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/externalServiceEvent/{id}")
  Call<ExternalServiceEvent> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalServiceEvent")
  Call<ExternalServiceEvent> create(@Path("projectId") String projectId, @Body ExternalServiceEvent externalServiceEvent)

  @PUT("projects/{projectId}/externalServiceEvent/{id}")
  Call<ExternalServiceEvent> update(@Path("projectId") String projectId, @Path("id") String id, @Body ExternalServiceEvent externalServiceEvent)

  @DELETE("projects/{projectId}/externalServiceEvent/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalServiceEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("projectId") String projectId, @Path("id") String id)
}
