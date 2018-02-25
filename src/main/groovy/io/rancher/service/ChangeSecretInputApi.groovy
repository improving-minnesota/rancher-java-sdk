package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ChangeSecretInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ChangeSecretInputApi {
  @GET("projects/{projectId}/changeSecretInput")
  Call<TypeCollection<ChangeSecretInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/changeSecretInput")
  Call<TypeCollection<ChangeSecretInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/changeSecretInput/{id}")
  Call<ChangeSecretInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/changeSecretInput")
  Call<ChangeSecretInput> create(@Path("projectId") String projectId, @Body ChangeSecretInput changeSecretInput)

  @PUT("projects/{projectId}/changeSecretInput/{id}")
  Call<ChangeSecretInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body ChangeSecretInput changeSecretInput)

  @DELETE("projects/{projectId}/changeSecretInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
