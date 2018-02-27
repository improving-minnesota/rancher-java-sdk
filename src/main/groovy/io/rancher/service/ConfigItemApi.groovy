package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ConfigItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ConfigItemApi {
  @GET("configItem")
  Call<TypeCollection<ConfigItem>> list()

  @GET("configItem")
  Call<TypeCollection<ConfigItem>> query(@QueryMap Map<String, String> filters)

  @GET("configItem/{id}")
  Call<ConfigItem> findById(@Path("id") String id)
}
