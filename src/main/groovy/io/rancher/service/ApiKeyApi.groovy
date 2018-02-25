package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ApiKey
import io.rancher.type.Credential
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ApiKeyApi {
  @GET("projects/{projectId}/apiKey")
  Call<TypeCollection<ApiKey>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/apiKey")
  Call<TypeCollection<ApiKey>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/apiKey/{id}")
  Call<ApiKey> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/apiKey")
  Call<ApiKey> create(@Path("projectId") String projectId, @Body ApiKey apiKey)

  @PUT("projects/{projectId}/apiKey/{id}")
  Call<ApiKey> update(@Path("projectId") String projectId, @Path("id") String id, @Body ApiKey apiKey)

  @DELETE("projects/{projectId}/apiKey/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/apiKey/{id}?action=activate")
  Call<Credential> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/apiKey/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/apiKey/{id}?action=purge")
  Call<Credential> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/apiKey/{id}?action=remove")
  Call<Credential> remove(@Path("projectId") String projectId, @Path("id") String id)
}
