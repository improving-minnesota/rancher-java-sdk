package io.rancher.service

import io.rancher.type.ServiceRestart
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceRestartApi {
  
  @GET("serviceRestart/{id}")
  Call<ServiceRestart> findById(@Path("id") String id)
}
