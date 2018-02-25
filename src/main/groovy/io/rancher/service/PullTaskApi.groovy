package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.GenericObject
import io.rancher.type.PullTask
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PullTaskApi {
  @GET("projects/{projectId}/pullTask")
  Call<TypeCollection<PullTask>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/pullTask")
  Call<TypeCollection<PullTask>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/pullTask/{id}")
  Call<PullTask> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/pullTask")
  Call<PullTask> create(@Path("projectId") String projectId, @Body PullTask pullTask)

  @PUT("projects/{projectId}/pullTask/{id}")
  Call<PullTask> update(@Path("projectId") String projectId, @Path("id") String id, @Body PullTask pullTask)

  @DELETE("projects/{projectId}/pullTask/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/pullTask/{id}?action=remove")
  Call<GenericObject> remove(@Path("projectId") String projectId, @Path("id") String id)
}
