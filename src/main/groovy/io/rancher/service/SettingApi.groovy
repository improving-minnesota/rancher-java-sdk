package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Setting
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SettingApi {
  @GET("projects/{projectId}/setting")
  Call<TypeCollection<Setting>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/setting")
  Call<TypeCollection<Setting>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/setting/{id}")
  Call<Setting> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/setting")
  Call<Setting> create(@Path("projectId") String projectId, @Body Setting setting)

  @PUT("projects/{projectId}/setting/{id}")
  Call<Setting> update(@Path("projectId") String projectId, @Path("id") String id, @Body Setting setting)

  @DELETE("projects/{projectId}/setting/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
