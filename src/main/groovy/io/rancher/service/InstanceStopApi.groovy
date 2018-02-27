package io.rancher.service

import io.rancher.type.InstanceStop
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface InstanceStopApi {

  @GET("instanceStop/{id}")
  Call<InstanceStop> findById(@Path("id") String id)
}
