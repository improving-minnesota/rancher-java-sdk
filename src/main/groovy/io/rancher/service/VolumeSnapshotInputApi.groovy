package io.rancher.service

import io.rancher.type.VolumeSnapshotInput
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface VolumeSnapshotInputApi { 

  @GET("volumeSnapshotInput/{id}")
  Call<VolumeSnapshotInput> findById(@Path("id") String id)
}
