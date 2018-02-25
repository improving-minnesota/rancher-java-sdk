package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ComposeService
import io.rancher.type.Service
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ComposeServiceApi {
  @GET("projects/{projectId}/composeService")
  Call<TypeCollection<ComposeService>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/composeService")
  Call<TypeCollection<ComposeService>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/composeService/{id}")
  Call<ComposeService> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeService")
  Call<ComposeService> create(@Path("projectId") String projectId, @Body ComposeService composeService)

  @PUT("projects/{projectId}/composeService/{id}")
  Call<ComposeService> update(@Path("projectId") String projectId, @Path("id") String id, @Body ComposeService composeService)

  @DELETE("projects/{projectId}/composeService/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeService/{id}?action=activate")
  Call<Service> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeService/{id}?action=remove")
  Call<Service> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeService/{id}?action=rollback")
  Call<Service> rollback(@Path("projectId") String projectId, @Path("id") String id)
}
