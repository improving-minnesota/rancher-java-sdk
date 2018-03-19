package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProcessExecution
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProcessExecutionApi {
  @GET('processExecutions')
  Call<TypeCollection<ProcessExecution>> list()

  @GET('processExecutions')
  Call<TypeCollection<ProcessExecution>> query(@QueryMap Map<String, String> filters)

  @GET('processExecutions/{id}')
  Call<ProcessExecution> findById(@Path('id') String id)

}
