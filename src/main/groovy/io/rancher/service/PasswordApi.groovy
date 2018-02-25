package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ChangeSecretInput
import io.rancher.type.Credential
import io.rancher.type.Password
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PasswordApi {
  @GET("projects/{projectId}/password")
  Call<TypeCollection<Password>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/password")
  Call<TypeCollection<Password>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/password/{id}")
  Call<Password> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/password")
  Call<Password> create(@Path("projectId") String projectId, @Body Password password)

  @PUT("projects/{projectId}/password/{id}")
  Call<Password> update(@Path("projectId") String projectId, @Path("id") String id, @Body Password password)

  @DELETE("projects/{projectId}/password/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/password/{id}?action=activate")
  Call<Credential> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/password/{id}?action=changesecret")
  Call<ChangeSecretInput> changesecret(@Path("projectId") String projectId, @Path("id") String id, @Body ChangeSecretInput changeSecretInput)

  @POST("projects/{projectId}/password/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/password/{id}?action=purge")
  Call<Credential> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/password/{id}?action=remove")
  Call<Credential> remove(@Path("projectId") String projectId, @Path("id") String id)
}
