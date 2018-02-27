package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Setting
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SettingApi { 
  @GET("setting")
  Call<TypeCollection<Setting>> list()

  @GET("setting")
  Call<TypeCollection<Setting>> query(@QueryMap Map<String, String> filters)

  @POST("setting")
  Call<Setting> create(@Body Setting setting)

  @GET("setting/{id}")
  Call<Setting> findById(@Path("id") String id)

  @PUT("setting/{id}")
  Call<Setting> update(@Path("id") String id, @Body Setting setting)

  @DELETE("setting/{id}")
  Call<Setting> delete(@Path("id") String id)
}
