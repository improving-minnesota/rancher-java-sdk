package io.rancher.service

import io.rancher.type.ExtensionImplementation
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ExtensionImplementationApi { 

  @GET("extensionImplementation/{id}")
  Call<ExtensionImplementation> findById(@Path("id") String id)
}
