package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.IpAddress
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface IpAddressApi {
  @GET('ipAddresses')
  Call<TypeCollection<IpAddress>> list()

  @GET('ipAddresses')
  Call<TypeCollection<IpAddress>> query(@QueryMap Map<String, String> filters)

  @GET('ipAddresses/{id}')
  Call<IpAddress> findById(@Path('id') String id)

  @POST('ipAddresses/{id}?action=activate')
  Call<IpAddress> activate(@Path('id') String id)

  @POST('ipAddresses/{id}?action=purge')
  Call<IpAddress> purge(@Path('id') String id)

  @POST('ipAddresses/{id}?action=remove')
  Call<IpAddress> remove(@Path('id') String id)

  @POST('ipAddresses/{id}?action=associate')
  Call<IpAddress> associate(@Path('id') String id)

  @POST('ipAddresses/{id}?action=deactivate')
  Call<IpAddress> deactivate(@Path('id') String id)

  @POST('ipAddresses/{id}?action=disassociate')
  Call<IpAddress> disassociate(@Path('id') String id)

}
