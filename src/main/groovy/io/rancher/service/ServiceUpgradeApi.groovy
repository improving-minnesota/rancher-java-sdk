package io.rancher.service

import io.rancher.type.ServiceUpgrade
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceUpgradeApi {

  @GET("serviceUpgrade/{id}")
  Call<ServiceUpgrade> findById(@Path("id") String id)
}
