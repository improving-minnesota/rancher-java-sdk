package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.CatalogTemplate
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface CatalogTemplateApi {
  @GET("projects/{projectId}/catalogTemplate")
  Call<TypeCollection<CatalogTemplate>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/catalogTemplate")
  Call<TypeCollection<CatalogTemplate>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/catalogTemplate/{id}")
  Call<CatalogTemplate> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/catalogTemplate")
  Call<CatalogTemplate> create(@Path("projectId") String projectId, @Body CatalogTemplate catalogTemplate)

  @PUT("projects/{projectId}/catalogTemplate/{id}")
  Call<CatalogTemplate> update(@Path("projectId") String projectId, @Path("id") String id, @Body CatalogTemplate catalogTemplate)

  @DELETE("projects/{projectId}/catalogTemplate/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
