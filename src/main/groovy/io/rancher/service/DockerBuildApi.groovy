package io.rancher.service

import io.rancher.type.DockerBuild
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DockerBuildApi {
  
  @GET("dockerBuild/{id}")
  Call<DockerBuild> findById(@Path("id") String id)
}
