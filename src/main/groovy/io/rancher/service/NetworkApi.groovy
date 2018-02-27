package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Network
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkApi {
  @GET("network")
  Call<TypeCollection<Network>> list()

  @GET("network")
  Call<TypeCollection<Network>> query(@QueryMap Map<String, String> filters)
  
  @GET("network/{id}")
  Call<Network> findById(@Path("id") String id)

  @POST("network/{id}?action=activate")
  Call<Network> activate(@Path("id") String id)

  @POST("network/{id}?action=deactivate")
  Call<Network> deactivate(@Path("id") String id)

  @POST("network/{id}?action=purge")
  Call<Network> purge(@Path("id") String id)

  @POST("network/{id}?action=remove")
  Call<Network> remove(@Path("id") String id)
}
