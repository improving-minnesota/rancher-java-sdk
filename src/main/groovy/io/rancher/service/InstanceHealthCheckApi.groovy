package io.rancher.service

import io.rancher.type.InstanceHealthCheck
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface InstanceHealthCheckApi { 

  @POST("instanceHealthCheck")
  Call<InstanceHealthCheck> create(@Body InstanceHealthCheck instanceHealthCheck)

  @GET("instanceHealthCheck/{id}")
  Call<InstanceHealthCheck> findById(@Path("id") String id)
}
