package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Port
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PortApi { 
  @GET("port")
  Call<TypeCollection<Port>> list()

  @GET("port")
  Call<TypeCollection<Port>> query(@QueryMap Map<String, String> filters)
  
  @GET("port/{id}")
  Call<Port> findById(@Path("id") String id)

  @POST("port/{id}?action=activate")
  Call<Port> activate(@Path("id") String id)

  @POST("port/{id}?action=deactivate")
  Call<Port> deactivate(@Path("id") String id)

  @POST("port/{id}?action=purge")
  Call<Port> purge(@Path("id") String id)

  @POST("port/{id}?action=remove")
  Call<Port> remove(@Path("id") String id)
}
