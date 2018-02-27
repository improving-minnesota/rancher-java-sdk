package io.rancher.service

import io.rancher.type.ComposeConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ComposeConfigApi {

  @GET("composeConfig/{id}")
  Call<ComposeConfig> findById(@Path("id") String id)
}
