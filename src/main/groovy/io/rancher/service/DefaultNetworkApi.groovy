package io.rancher.service

import io.rancher.type.DefaultNetwork
import io.rancher.type.Network
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface DefaultNetworkApi {

  @GET("defaultNetwork/{id}")
  Call<DefaultNetwork> findById(@Path("id") String id)

  @POST("defaultNetwork/{id}?action=activate")
  Call<Network> activate(@Path("id") String id)

  @POST("defaultNetwork/{id}?action=deactivate")
  Call<Network> deactivate(@Path("id") String id)

  @POST("defaultNetwork/{id}?action=purge")
  Call<Network> purge(@Path("id") String id)

  @POST("defaultNetwork/{id}?action=remove")
  Call<Network> remove(@Path("id") String id)
}
