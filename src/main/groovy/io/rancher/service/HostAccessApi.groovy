package io.rancher.service

import io.rancher.type.HostAccess
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface HostAccessApi {

  @GET("hostAccess/{id}")
  Call<HostAccess> findById(@Path("id") String id)
}
