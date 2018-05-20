package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProcessPool
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProcessPoolApi {
  @GET('processPools')
  Call<TypeCollection<ProcessPool>> list()

  @GET('processPools')
  Call<TypeCollection<ProcessPool>> query(@QueryMap Map<String, String> filters)

  @GET('processPools/{id}')
  Call<ProcessPool> findById(@Path('id') String id)

}
