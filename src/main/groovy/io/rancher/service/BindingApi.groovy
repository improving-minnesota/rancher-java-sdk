package io.rancher.service

import io.rancher.type.Binding
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BindingApi {

  @GET("binding/{id}")
  Call<Binding> findById(@Path("id") String id)
}
