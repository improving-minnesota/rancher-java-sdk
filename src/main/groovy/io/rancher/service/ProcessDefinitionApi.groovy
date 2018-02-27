package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProcessDefinition
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProcessDefinitionApi { 
  @GET("processDefinition")
  Call<TypeCollection<ProcessDefinition>> list()

  @GET("processDefinition")
  Call<TypeCollection<ProcessDefinition>> query(@QueryMap Map<String, String> filters)

  @GET("processDefinition/{id}")
  Call<ProcessDefinition> findById(@Path("id") String id)
}
