package io.rancher.service

import io.rancher.type.ServicesPortRange
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ServicesPortRangeApi {

  @POST("servicesPortRange")
  Call<ServicesPortRange> create(@Body ServicesPortRange servicesPortRange)
  
  @GET("servicesPortRange/{id}")
  Call<ServicesPortRange> findById(@Path("id") String id)

  @PUT("servicesPortRange/{id}")
  Call<ServicesPortRange> update(@Path("id") String id, @Body ServicesPortRange servicesPortRange)
}
