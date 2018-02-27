package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ResourceDefinition
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ResourceDefinitionApi { 
  @GET("resourceDefinition")
  Call<TypeCollection<ResourceDefinition>> list()

  @GET("resourceDefinition")
  Call<TypeCollection<ResourceDefinition>> query(@QueryMap Map<String, String> filters)

  @GET("resourceDefinition/{id}")
  Call<ResourceDefinition> findById(@Path("id") String id)
}
