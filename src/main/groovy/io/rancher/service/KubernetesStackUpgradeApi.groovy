package io.rancher.service

import io.rancher.type.KubernetesStackUpgrade
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface KubernetesStackUpgradeApi {

  @GET("kubernetesStackUpgrade/{id}")
  Call<KubernetesStackUpgrade> findById(@Path("id") String id)
}
