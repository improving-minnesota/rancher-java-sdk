package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.StorageDriver
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface StorageDriverApi {
  @GET("projects/{projectId}/storageDriver")
  Call<TypeCollection<StorageDriver>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/storageDriver")
  Call<TypeCollection<StorageDriver>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/storageDriver/{id}")
  Call<StorageDriver> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriver")
  Call<StorageDriver> create(@Path("projectId") String projectId, @Body StorageDriver storageDriver)

  @PUT("projects/{projectId}/storageDriver/{id}")
  Call<StorageDriver> update(@Path("projectId") String projectId, @Path("id") String id, @Body StorageDriver storageDriver)

  @DELETE("projects/{projectId}/storageDriver/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriver/{id}?action=activate")
  Call<StorageDriver> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriver/{id}?action=deactivate")
  Call<StorageDriver> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriver/{id}?action=remove")
  Call<StorageDriver> remove(@Path("projectId") String projectId, @Path("id") String id)
}
