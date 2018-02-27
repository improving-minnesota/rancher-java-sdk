package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import io.rancher.type.ExternalStoragePoolEvent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalStoragePoolEventApi { 
  @GET("externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> list()

  @GET("externalStoragePoolEvent")
  Call<TypeCollection<ExternalStoragePoolEvent>> query(@QueryMap Map<String, String> filters)
  
  @GET("externalStoragePoolEvent/{id}")
  Call<ExternalStoragePoolEvent> findById(@Path("id") String id)

  @POST("externalStoragePoolEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id)
}
