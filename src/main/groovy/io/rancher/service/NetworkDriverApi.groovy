package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.NetworkDriver
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkDriverApi {
  @GET("networkDriver")
  Call<TypeCollection<NetworkDriver>> list()

  @GET("networkDriver")
  Call<TypeCollection<NetworkDriver>> query(@QueryMap Map<String, String> filters)

  @GET("networkDriver/{id}")
  Call<NetworkDriver> findById(@Path("id") String id)

  @POST("networkDriver/{id}?action=activate")
  Call<NetworkDriver> activate(@Path("id") String id)

  @POST("networkDriver/{id}?action=deactivate")
  Call<NetworkDriver> deactivate(@Path("id") String id)

  @POST("networkDriver/{id}?action=remove")
  Call<NetworkDriver> remove(@Path("id") String id)
}
