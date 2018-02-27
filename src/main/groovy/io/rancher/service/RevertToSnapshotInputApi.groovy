package io.rancher.service

import io.rancher.type.RevertToSnapshotInput
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RevertToSnapshotInputApi { 

  @GET("revertToSnapshotInput/{id}")
  Call<RevertToSnapshotInput> findById(@Path("id") String id)
}
