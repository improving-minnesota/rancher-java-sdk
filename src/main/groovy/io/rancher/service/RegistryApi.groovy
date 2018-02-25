package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Registry
import io.rancher.type.StoragePool
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegistryApi {
  @GET("projects/{projectId}/registry")
  Call<TypeCollection<Registry>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/registry")
  Call<TypeCollection<Registry>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/registry/{id}")
  Call<Registry> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registry")
  Call<Registry> create(@Path("projectId") String projectId, @Body Registry registry)

  @PUT("projects/{projectId}/registry/{id}")
  Call<Registry> update(@Path("projectId") String projectId, @Path("id") String id, @Body Registry registry)

  @DELETE("projects/{projectId}/registry/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registry/{id}?action=activate")
  Call<StoragePool> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registry/{id}?action=deactivate")
  Call<StoragePool> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registry/{id}?action=purge")
  Call<StoragePool> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registry/{id}?action=remove")
  Call<StoragePool> remove(@Path("projectId") String projectId, @Path("id") String id)
}
