package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Credential
import io.rancher.type.RegistryCredential
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegistryCredentialApi {
  @GET("projects/{projectId}/registryCredential")
  Call<TypeCollection<RegistryCredential>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/registryCredential")
  Call<TypeCollection<RegistryCredential>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/registryCredential/{id}")
  Call<RegistryCredential> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registryCredential")
  Call<RegistryCredential> create(@Path("projectId") String projectId, @Body RegistryCredential registryCredential)

  @PUT("projects/{projectId}/registryCredential/{id}")
  Call<RegistryCredential> update(@Path("projectId") String projectId, @Path("id") String id, @Body RegistryCredential registryCredential)

  @DELETE("projects/{projectId}/registryCredential/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registryCredential/{id}?action=activate")
  Call<Credential> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registryCredential/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registryCredential/{id}?action=purge")
  Call<Credential> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registryCredential/{id}?action=remove")
  Call<Credential> remove(@Path("projectId") String projectId, @Path("id") String id)
}
