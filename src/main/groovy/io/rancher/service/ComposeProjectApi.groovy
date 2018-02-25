package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ComposeProject
import io.rancher.type.Stack
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ComposeProjectApi {
  @GET("projects/{projectId}/composeProject")
  Call<TypeCollection<ComposeProject>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/composeProject")
  Call<TypeCollection<ComposeProject>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/composeProject/{id}")
  Call<ComposeProject> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeProject")
  Call<ComposeProject> create(@Path("projectId") String projectId, @Body ComposeProject composeProject)

  @PUT("projects/{projectId}/composeProject/{id}")
  Call<ComposeProject> update(@Path("projectId") String projectId, @Path("id") String id, @Body ComposeProject composeProject)

  @DELETE("projects/{projectId}/composeProject/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeProject/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeProject/{id}?action=error")
  Call<Stack> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeProject/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeProject/{id}?action=remove")
  Call<Stack> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/composeProject/{id}?action=rollback")
  Call<Stack> rollback(@Path("projectId") String projectId, @Path("id") String id)
}
