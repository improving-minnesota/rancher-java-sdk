package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.NfsConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NfsConfigApi {
  @GET("projects/{projectId}/nfsConfig")
  Call<TypeCollection<NfsConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/nfsConfig")
  Call<TypeCollection<NfsConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/nfsConfig/{id}")
  Call<NfsConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/nfsConfig")
  Call<NfsConfig> create(@Path("projectId") String projectId, @Body NfsConfig nfsConfig)

  @PUT("projects/{projectId}/nfsConfig/{id}")
  Call<NfsConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body NfsConfig nfsConfig)

  @DELETE("projects/{projectId}/nfsConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
