package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalEventApi {
  @GET("externalEvent")
  Call<TypeCollection<ExternalEvent>> list()

  @GET("externalEvent")
  Call<TypeCollection<ExternalEvent>> query(@QueryMap Map<String, String> filters)

  @GET("externalEvent/{id}")
  Call<ExternalEvent> findById(@Path("id") String id)

  @POST("externalEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id)
}
