package io.rancher.service

import io.rancher.type.RecreateOnQuorumStrategyConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RecreateOnQuorumStrategyConfigApi { 

  @GET("recreateOnQuorumStrategyConfig/{id}")
  Call<RecreateOnQuorumStrategyConfig> findById(@Path("id") String id)
}
