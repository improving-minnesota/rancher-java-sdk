package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.TypeDocumentation
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface TypeDocumentationApi {
  @GET("projects/{projectId}/typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/typeDocumentation/{id}")
  Call<TypeDocumentation> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/typeDocumentation")
  Call<TypeDocumentation> create(@Path("projectId") String projectId, @Body TypeDocumentation typeDocumentation)

  @PUT("projects/{projectId}/typeDocumentation/{id}")
  Call<TypeDocumentation> update(@Path("projectId") String projectId, @Path("id") String id, @Body TypeDocumentation typeDocumentation)

  @DELETE("projects/{projectId}/typeDocumentation/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
