package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.TargetPortRule
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface TargetPortRuleApi {
  @GET("projects/{projectId}/targetPortRule")
  Call<TypeCollection<TargetPortRule>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/targetPortRule")
  Call<TypeCollection<TargetPortRule>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/targetPortRule/{id}")
  Call<TargetPortRule> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/targetPortRule")
  Call<TargetPortRule> create(@Path("projectId") String projectId, @Body TargetPortRule targetPortRule)

  @PUT("projects/{projectId}/targetPortRule/{id}")
  Call<TargetPortRule> update(@Path("projectId") String projectId, @Path("id") String id, @Body TargetPortRule targetPortRule)

  @DELETE("projects/{projectId}/targetPortRule/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
