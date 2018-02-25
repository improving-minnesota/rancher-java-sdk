package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ScheduledUpgrade
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ScheduledUpgradeApi {
  @GET("projects/{projectId}/scheduledUpgrade")
  Call<TypeCollection<ScheduledUpgrade>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/scheduledUpgrade")
  Call<TypeCollection<ScheduledUpgrade>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/scheduledUpgrade/{id}")
  Call<ScheduledUpgrade> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/scheduledUpgrade")
  Call<ScheduledUpgrade> create(@Path("projectId") String projectId, @Body ScheduledUpgrade scheduledUpgrade)

  @PUT("projects/{projectId}/scheduledUpgrade/{id}")
  Call<ScheduledUpgrade> update(@Path("projectId") String projectId, @Path("id") String id, @Body ScheduledUpgrade scheduledUpgrade)

  @DELETE("projects/{projectId}/scheduledUpgrade/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/scheduledUpgrade/{id}?action=remove")
  Call<ScheduledUpgrade> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/scheduledUpgrade/{id}?action=start")
  Call<ScheduledUpgrade> start(@Path("projectId") String projectId, @Path("id") String id)
}
