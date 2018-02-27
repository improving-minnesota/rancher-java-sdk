package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import io.rancher.type.ExternalVolumeEvent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalVolumeEventApi { 
  @GET("externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> list()

  @GET("externalVolumeEvent")
  Call<TypeCollection<ExternalVolumeEvent>> query(@QueryMap Map<String, String> filters)
  
  @GET("externalVolumeEvent/{id}")
  Call<ExternalVolumeEvent> findById(@Path("id") String id)

  @POST("externalVolumeEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id)
}
