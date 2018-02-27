package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.HaConfigInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HaConfigInputApi {
  @GET("haConfigInput")
  Call<TypeCollection<HaConfigInput>> list()

  @GET("haConfigInput")
  Call<TypeCollection<HaConfigInput>> query(@QueryMap Map<String, String> filters)

  @POST("haConfigInput")
  Call<HaConfigInput> create(@Body HaConfigInput haConfigInput)

  @GET("haConfigInput/{id}")
  Call<HaConfigInput> findById(@Path("id") String id)
}
