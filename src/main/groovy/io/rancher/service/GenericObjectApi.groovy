package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.GenericObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface GenericObjectApi {
  @GET('genericObjects')
  Call<TypeCollection<GenericObject>> list()

  @GET('genericObjects')
  Call<TypeCollection<GenericObject>> query(@QueryMap Map<String, String> filters)

  @POST('genericObjects')
  Call<GenericObject> create(@Body GenericObject genericObject)

  @GET('genericObjects/{id}')
  Call<GenericObject> findById(@Path('id') String id)

  @PUT('genericObjects/{id}')
  Call<GenericObject> update(@Path('id') String id, @Body GenericObject genericObject)

  @DELETE('genericObjects/{id}')
  Call<GenericObject> delete(@Path('id') String id)

  @POST('genericObjects/{id}?action=remove')
  Call<GenericObject> remove(@Path('id') String id)

}
