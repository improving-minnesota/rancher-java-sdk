package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ActiveSetting
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ActiveSettingApi {
  @GET("projects/{projectId}/activeSetting")
  Call<TypeCollection<ActiveSetting>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/activeSetting")
  Call<TypeCollection<ActiveSetting>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/activeSetting/{id}")
  Call<ActiveSetting> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/activeSetting")
  Call<ActiveSetting> create(@Path("projectId") String projectId, @Body ActiveSetting activeSetting)

  @PUT("projects/{projectId}/activeSetting/{id}")
  Call<ActiveSetting> update(@Path("projectId") String projectId, @Path("id") String id, @Body ActiveSetting activeSetting)

  @DELETE("projects/{projectId}/activeSetting/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
