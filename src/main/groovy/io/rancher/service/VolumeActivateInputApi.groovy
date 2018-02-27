package io.rancher.service

import io.rancher.type.VolumeActivateInput
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface VolumeActivateInputApi { 

  @GET("volumeActivateInput/{id}")
  Call<VolumeActivateInput> findById(@Path("id") String id)
}
