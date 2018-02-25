package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ProjectTemplate
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProjectTemplateApi {
  @GET("projects/{projectId}/projectTemplate")
  Call<TypeCollection<ProjectTemplate>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/projectTemplate")
  Call<TypeCollection<ProjectTemplate>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/projectTemplate/{id}")
  Call<ProjectTemplate> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/projectTemplate")
  Call<ProjectTemplate> create(@Path("projectId") String projectId, @Body ProjectTemplate projectTemplate)

  @PUT("projects/{projectId}/projectTemplate/{id}")
  Call<ProjectTemplate> update(@Path("projectId") String projectId, @Path("id") String id, @Body ProjectTemplate projectTemplate)

  @DELETE("projects/{projectId}/projectTemplate/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/projectTemplate/{id}?action=remove")
  Call<ProjectTemplate> remove(@Path("projectId") String projectId, @Path("id") String id)
}
