package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProcessExecution
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProcessExecutionApi { 
  @GET("processExecution")
  Call<TypeCollection<ProcessExecution>> list()

  @GET("processExecution")
  Call<TypeCollection<ProcessExecution>> query(@QueryMap Map<String, String> filters)
  
  @GET("processExecution/{id}")
  Call<ProcessExecution> findById(@Path("id") String id)
}
