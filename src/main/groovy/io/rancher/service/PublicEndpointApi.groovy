package io.rancher.service

import io.rancher.type.PublicEndpoint
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface PublicEndpointApi {

  @POST("publicEndpoint")
  Call<PublicEndpoint> create(@Body PublicEndpoint publicEndpoint)

  @GET("publicEndpoint/{id}")
  Call<PublicEndpoint> findById(@Path("id") String id)
}
