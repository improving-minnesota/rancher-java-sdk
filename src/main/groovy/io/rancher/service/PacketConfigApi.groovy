package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.PacketConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PacketConfigApi {
  @GET("projects/{projectId}/packetConfig")
  Call<TypeCollection<PacketConfig>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/packetConfig")
  Call<TypeCollection<PacketConfig>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/packetConfig/{id}")
  Call<PacketConfig> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/packetConfig")
  Call<PacketConfig> create(@Path("projectId") String projectId, @Body PacketConfig packetConfig)

  @PUT("projects/{projectId}/packetConfig/{id}")
  Call<PacketConfig> update(@Path("projectId") String projectId, @Path("id") String id, @Body PacketConfig packetConfig)

  @DELETE("projects/{projectId}/packetConfig/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
