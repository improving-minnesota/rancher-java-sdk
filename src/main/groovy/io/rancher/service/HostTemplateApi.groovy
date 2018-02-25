package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.HostTemplate
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HostTemplateApi {
  @GET("projects/{projectId}/hostTemplate")
  Call<TypeCollection<HostTemplate>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/hostTemplate")
  Call<TypeCollection<HostTemplate>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/hostTemplate/{id}")
  Call<HostTemplate> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/hostTemplate")
  Call<HostTemplate> create(@Path("projectId") String projectId, @Body HostTemplate hostTemplate)

  @PUT("projects/{projectId}/hostTemplate/{id}")
  Call<HostTemplate> update(@Path("projectId") String projectId, @Path("id") String id, @Body HostTemplate hostTemplate)

  @DELETE("projects/{projectId}/hostTemplate/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/hostTemplate/{id}?action=remove")
  Call<HostTemplate> remove(@Path("projectId") String projectId, @Path("id") String id)
}
