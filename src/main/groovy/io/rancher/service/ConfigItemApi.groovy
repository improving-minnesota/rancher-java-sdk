package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ConfigItem
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ConfigItemApi {
  @GET('configItems')
  Call<TypeCollection<ConfigItem>> list()

  @GET('configItems')
  Call<TypeCollection<ConfigItem>> query(@QueryMap Map<String, String> filters)

  @GET('configItems/{id}')
  Call<ConfigItem> findById(@Path('id') String id)

}
