package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ContainerEvent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ContainerEventApi {
  @GET("containerEvent")
  Call<TypeCollection<ContainerEvent>> list()

  @GET("containerEvent")
  Call<TypeCollection<ContainerEvent>> query(@QueryMap Map<String, String> filters)

  @GET("containerEvent/{id}")
  Call<ContainerEvent> findById(@Path("id") String id)

  @POST("containerEvent/{id}?action=remove")
  Call<ContainerEvent> remove(@Path("id") String id)
}
