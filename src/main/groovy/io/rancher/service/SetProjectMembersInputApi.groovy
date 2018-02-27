package io.rancher.service

import io.rancher.type.SetProjectMembersInput
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SetProjectMembersInputApi { 

  @GET("setProjectMembersInput/{id}")
  Call<SetProjectMembersInput> findById(@Path("id") String id)
}
