package io.rancher.service

import io.rancher.type.ServiceBinding
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceBindingApi {
  
  @GET("serviceBinding/{id}")
  Call<ServiceBinding> findById(@Path("id") String id)
}
