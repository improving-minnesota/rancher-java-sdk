package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.TypeDocumentation
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface TypeDocumentationApi {
  @GET('typeDocumentations')
  Call<TypeCollection<TypeDocumentation>> list()

  @GET('typeDocumentations')
  Call<TypeCollection<TypeDocumentation>> query(@QueryMap Map<String, String> filters)

  @GET('typeDocumentations/{id}')
  Call<TypeDocumentation> findById(@Path('id') String id)

}
