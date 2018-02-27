package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.IpAddress
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface IpAddressApi {
  @GET("ipAddress")
  Call<TypeCollection<IpAddress>> list()

  @GET("ipAddress")
  Call<TypeCollection<IpAddress>> query(@QueryMap Map<String, String> filters)
  
  @GET("ipAddress/{id}")
  Call<IpAddress> findById(@Path("id") String id)

  @POST("ipAddress/{id}?action=activate")
  Call<IpAddress> activate(@Path("id") String id)

  @POST("ipAddress/{id}?action=associate")
  Call<IpAddress> associate(@Path("id") String id)

  @POST("ipAddress/{id}?action=deactivate")
  Call<IpAddress> deactivate(@Path("id") String id)

  @POST("ipAddress/{id}?action=disassociate")
  Call<IpAddress> disassociate(@Path("id") String id)

  @POST("ipAddress/{id}?action=purge")
  Call<IpAddress> purge(@Path("id") String id)

  @POST("ipAddress/{id}?action=remove")
  Call<IpAddress> remove(@Path("id") String id)
}
