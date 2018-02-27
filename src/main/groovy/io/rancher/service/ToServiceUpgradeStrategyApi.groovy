package io.rancher.service

import io.rancher.type.ToServiceUpgradeStrategy
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ToServiceUpgradeStrategyApi { 
  
  @GET("toServiceUpgradeStrategy/{id}")
  Call<ToServiceUpgradeStrategy> findById(@Path("id") String id)
}
