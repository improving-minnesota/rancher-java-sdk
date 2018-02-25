package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Certificate
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface CertificateApi {
  @GET("projects/{projectId}/certificate")
  Call<TypeCollection<Certificate>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/certificate")
  Call<TypeCollection<Certificate>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/certificate/{id}")
  Call<Certificate> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/certificate")
  Call<Certificate> create(@Path("projectId") String projectId, @Body Certificate certificate)

  @PUT("projects/{projectId}/certificate/{id}")
  Call<Certificate> update(@Path("projectId") String projectId, @Path("id") String id, @Body Certificate certificate)

  @DELETE("projects/{projectId}/certificate/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/certificate/{id}?action=remove")
  Call<Certificate> remove(@Path("projectId") String projectId, @Path("id") String id)
}
