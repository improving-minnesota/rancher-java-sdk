package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Credential
import io.rancher.type.RegistrationToken
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegistrationTokenApi {
  @GET("projects/{projectId}/registrationToken")
  Call<TypeCollection<RegistrationToken>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/registrationToken")
  Call<TypeCollection<RegistrationToken>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/registrationToken/{id}")
  Call<RegistrationToken> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registrationToken")
  Call<RegistrationToken> create(@Path("projectId") String projectId, @Body RegistrationToken registrationToken)

  @PUT("projects/{projectId}/registrationToken/{id}")
  Call<RegistrationToken> update(@Path("projectId") String projectId, @Path("id") String id, @Body RegistrationToken registrationToken)

  @DELETE("projects/{projectId}/registrationToken/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registrationToken/{id}?action=activate")
  Call<Credential> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registrationToken/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registrationToken/{id}?action=purge")
  Call<Credential> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/registrationToken/{id}?action=remove")
  Call<Credential> remove(@Path("projectId") String projectId, @Path("id") String id)
}
