package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceLink
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceLinkApi {
  @GET("projects/{projectId}/serviceLink")
  Call<TypeCollection<ServiceLink>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceLink")
  Call<TypeCollection<ServiceLink>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceLink/{id}")
  Call<ServiceLink> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceLink")
  Call<ServiceLink> create(@Path("projectId") String projectId, @Body ServiceLink serviceLink)

  @PUT("projects/{projectId}/serviceLink/{id}")
  Call<ServiceLink> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceLink serviceLink)

  @DELETE("projects/{projectId}/serviceLink/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
