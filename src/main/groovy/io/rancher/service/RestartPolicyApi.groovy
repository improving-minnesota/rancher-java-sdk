package io.rancher.service

import io.rancher.type.RestartPolicy
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RestartPolicyApi {

  @GET("restartPolicy/{id}")
  Call<RestartPolicy> findById(@Path("id") String id)
}
