package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.TypeDocumentation
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface TypeDocumentationApi { 
  @GET("typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> list()

  @GET("typeDocumentation")
  Call<TypeCollection<TypeDocumentation>> query(@QueryMap Map<String, String> filters)
  
  @GET("typeDocumentation/{id}")
  Call<TypeDocumentation> findById(@Path("id") String id)
}
