package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.HaConfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HaConfigApi {
  @GET("haConfig")
  Call<TypeCollection<HaConfig>> list()

  @GET("haConfig")
  Call<TypeCollection<HaConfig>> query(@QueryMap Map<String, String> filters)
  
  @GET("haConfig/{id}")
  Call<HaConfig> findById(@Path("id") String id)

  @PUT("haConfig/{id}")
  Call<HaConfig> update(@Path("id") String id, @Body HaConfig haConfig)
}
