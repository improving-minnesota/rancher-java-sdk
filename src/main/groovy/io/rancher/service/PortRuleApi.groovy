package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.PortRule
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PortRuleApi {
  @GET("projects/{projectId}/portRule")
  Call<TypeCollection<PortRule>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/portRule")
  Call<TypeCollection<PortRule>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/portRule/{id}")
  Call<PortRule> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/portRule")
  Call<PortRule> create(@Path("projectId") String projectId, @Body PortRule portRule)

  @PUT("projects/{projectId}/portRule/{id}")
  Call<PortRule> update(@Path("projectId") String projectId, @Path("id") String id, @Body PortRule portRule)

  @DELETE("projects/{projectId}/portRule/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
