package io.rancher.service

import io.rancher.type.ScalePolicy
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ScalePolicyApi {
  
  @GET("scalePolicy/{id}")
  Call<ScalePolicy> findById(@Path("id") String id)
}
