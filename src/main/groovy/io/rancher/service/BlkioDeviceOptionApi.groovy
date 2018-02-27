package io.rancher.service

import io.rancher.type.BlkioDeviceOption
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BlkioDeviceOptionApi { 
  
  @GET("blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> findById(@Path("id") String id)
}
