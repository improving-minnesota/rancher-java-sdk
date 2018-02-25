package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.DockerBuild
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DockerBuildApi {
  @GET("projects/{projectId}/dockerBuild")
  Call<TypeCollection<DockerBuild>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/dockerBuild")
  Call<TypeCollection<DockerBuild>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/dockerBuild/{id}")
  Call<DockerBuild> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dockerBuild")
  Call<DockerBuild> create(@Path("projectId") String projectId, @Body DockerBuild dockerBuild)

  @PUT("projects/{projectId}/dockerBuild/{id}")
  Call<DockerBuild> update(@Path("projectId") String projectId, @Path("id") String id, @Body DockerBuild dockerBuild)

  @DELETE("projects/{projectId}/dockerBuild/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
