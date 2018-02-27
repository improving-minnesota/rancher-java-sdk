package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceEvent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceEventApi {
  @GET("serviceEvent")
  Call<TypeCollection<ServiceEvent>> list()

  @GET("serviceEvent")
  Call<TypeCollection<ServiceEvent>> query(@QueryMap Map<String, String> filters)
  
  @GET("serviceEvent/{id}")
  Call<ServiceEvent> findById(@Path("id") String id)

  @POST("serviceEvent/{id}?action=remove")
  Call<ServiceEvent> remove(@Path("id") String id)
}
