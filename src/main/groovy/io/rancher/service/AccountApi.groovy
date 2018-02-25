package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Account
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AccountApi {
  @GET("projects/{projectId}/account")
  Call<TypeCollection<Account>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/account")
  Call<TypeCollection<Account>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/account/{id}")
  Call<Account> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/account")
  Call<Account> create(@Path("projectId") String projectId, @Body Account account)

  @PUT("projects/{projectId}/account/{id}")
  Call<Account> update(@Path("projectId") String projectId, @Path("id") String id, @Body Account account)

  @DELETE("projects/{projectId}/account/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/account/{id}?action=activate")
  Call<Account> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/account/{id}?action=deactivate")
  Call<Account> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/account/{id}?action=purge")
  Call<Account> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/account/{id}?action=remove")
  Call<Account> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/account/{id}?action=upgrade")
  Call<Account> upgrade(@Path("projectId") String projectId, @Path("id") String id)
}
