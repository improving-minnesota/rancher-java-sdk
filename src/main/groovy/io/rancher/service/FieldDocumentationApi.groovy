package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.FieldDocumentation
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface FieldDocumentationApi {
  @GET("projects/{projectId}/fieldDocumentation")
  Call<TypeCollection<FieldDocumentation>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/fieldDocumentation")
  Call<TypeCollection<FieldDocumentation>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/fieldDocumentation/{id}")
  Call<FieldDocumentation> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/fieldDocumentation")
  Call<FieldDocumentation> create(@Path("projectId") String projectId, @Body FieldDocumentation fieldDocumentation)

  @PUT("projects/{projectId}/fieldDocumentation/{id}")
  Call<FieldDocumentation> update(@Path("projectId") String projectId, @Path("id") String id, @Body FieldDocumentation fieldDocumentation)

  @DELETE("projects/{projectId}/fieldDocumentation/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
