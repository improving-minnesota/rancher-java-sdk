package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceLog
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceLogApi {
  @GET('serviceLogs')
  Call<TypeCollection<ServiceLog>> list()

  @GET('serviceLogs')
  Call<TypeCollection<ServiceLog>> query(@QueryMap Map<String, String> filters)

  @GET('serviceLogs/{id}')
  Call<ServiceLog> findById(@Path('id') String id)

}
