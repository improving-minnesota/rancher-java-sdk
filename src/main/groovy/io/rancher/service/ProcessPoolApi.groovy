package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProcessPool
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProcessPoolApi {
  @GET("processPool")
  Call<TypeCollection<ProcessPool>> list()

  @GET("processPool")
  Call<TypeCollection<ProcessPool>> query(@QueryMap Map<String, String> filters)

  @GET("processPool/{id}")
  Call<ProcessPool> findById(@Path("id") String id)
}
