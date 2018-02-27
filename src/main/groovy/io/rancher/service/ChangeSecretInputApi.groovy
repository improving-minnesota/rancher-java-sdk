package io.rancher.service

import io.rancher.type.ChangeSecretInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ChangeSecretInputApi {

  @POST("changeSecretInput")
  Call<ChangeSecretInput> create(@Body ChangeSecretInput changeSecretInput)

  @GET("changeSecretInput/{id}")
  Call<ChangeSecretInput> findById(@Path("id") String id)
}
