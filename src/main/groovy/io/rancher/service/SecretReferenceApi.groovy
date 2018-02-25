package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.SecretReference
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SecretReferenceApi {
  @GET("projects/{projectId}/secretReference")
  Call<TypeCollection<SecretReference>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/secretReference")
  Call<TypeCollection<SecretReference>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/secretReference/{id}")
  Call<SecretReference> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/secretReference")
  Call<SecretReference> create(@Path("projectId") String projectId, @Body SecretReference secretReference)

  @PUT("projects/{projectId}/secretReference/{id}")
  Call<SecretReference> update(@Path("projectId") String projectId, @Path("id") String id, @Body SecretReference secretReference)

  @DELETE("projects/{projectId}/secretReference/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
