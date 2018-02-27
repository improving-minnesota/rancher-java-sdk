package io.rancher.service

import io.rancher.type.SecretReference
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SecretReferenceApi {

  @POST("secretReference")
  Call<SecretReference> create(@Body SecretReference secretReference)

  @GET("secretReference/{id}")
  Call<SecretReference> findById(@Path("id") String id)
}
