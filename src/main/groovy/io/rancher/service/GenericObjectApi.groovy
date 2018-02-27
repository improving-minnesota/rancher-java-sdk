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
  @GET("genericObject")
  Call<TypeCollection<GenericObject>> list()

  @GET("genericObject")
  Call<TypeCollection<GenericObject>> query(@QueryMap Map<String, String> filters)

  @POST("genericObject")
  Call<GenericObject> create(@Body GenericObject genericObject)
  
  @GET("genericObject/{id}")
  Call<GenericObject> findById(@Path("id") String id)

  @PUT("genericObject/{id}")
  Call<GenericObject> update(@Path("id") String id, @Body GenericObject genericObject)

  @DELETE("genericObject/{id}")
  Call<GenericObject> delete(@Path("id") String id)

  @POST("genericObject/{id}?action=remove")
  Call<GenericObject> remove(@Path("id") String id)
}
