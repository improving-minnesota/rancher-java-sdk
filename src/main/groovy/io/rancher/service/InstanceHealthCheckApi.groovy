package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.InstanceHealthCheck
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InstanceHealthCheckApi {

  @POST('instanceHealthChecks')
  Call<InstanceHealthCheck> create(@Body InstanceHealthCheck instanceHealthCheck)

  @GET('instanceHealthChecks/{id}')
  Call<InstanceHealthCheck> findById(@Path('id') String id)

}
