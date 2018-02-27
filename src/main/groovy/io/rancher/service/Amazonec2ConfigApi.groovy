package io.rancher.service

import io.rancher.type.Amazonec2Config
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Amazonec2ConfigApi {

  @POST("amazonec2Config")
  Call<Amazonec2Config> create(@Body Amazonec2Config amazonec2Config)

  @GET("amazonec2Config/{id}")
  Call<Amazonec2Config> findById(@Path("id") String id)
}
