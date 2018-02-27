package io.rancher.service

import io.rancher.type.ComposeConfigInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ComposeConfigInputApi {

  @POST("composeConfigInput")
  Call<ComposeConfigInput> create(@Body ComposeConfigInput composeConfigInput)

  @GET("composeConfigInput/{id}")
  Call<ComposeConfigInput> findById(@Path("id") String id)
}
