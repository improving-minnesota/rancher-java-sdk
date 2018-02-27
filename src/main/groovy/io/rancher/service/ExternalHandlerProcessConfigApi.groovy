package io.rancher.service

import io.rancher.type.ExternalHandlerProcessConfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ExternalHandlerProcessConfigApi { 

  @POST("externalHandlerProcessConfig")
  Call<ExternalHandlerProcessConfig> create(@Body ExternalHandlerProcessConfig externalHandlerProcessConfig)
  
  @GET("externalHandlerProcessConfig/{id}")
  Call<ExternalHandlerProcessConfig> findById(@Path("id") String id)
}
