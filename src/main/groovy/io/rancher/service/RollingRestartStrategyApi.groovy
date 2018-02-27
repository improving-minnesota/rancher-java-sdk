package io.rancher.service

import io.rancher.type.RollingRestartStrategy
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RollingRestartStrategyApi { 

  @GET("rollingRestartStrategy/{id}")
  Call<RollingRestartStrategy> findById(@Path("id") String id)
}
