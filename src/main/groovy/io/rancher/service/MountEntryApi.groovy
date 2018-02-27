package io.rancher.service

import io.rancher.type.MountEntry
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MountEntryApi {
  
  @GET("mountEntry/{id}")
  Call<MountEntry> findById(@Path("id") String id)
}
