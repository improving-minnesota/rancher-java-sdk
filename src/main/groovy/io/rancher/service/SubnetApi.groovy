package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Subnet
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SubnetApi {
  @GET('subnets')
  Call<TypeCollection<Subnet>> list()

  @GET('subnets')
  Call<TypeCollection<Subnet>> query(@QueryMap Map<String, String> filters)

  @GET('subnets/{id}')
  Call<Subnet> findById(@Path('id') String id)

  @POST('subnets/{id}?action=activate')
  Call<Subnet> activate(@Path('id') String id)

  @POST('subnets/{id}?action=purge')
  Call<Subnet> purge(@Path('id') String id)

  @POST('subnets/{id}?action=remove')
  Call<Subnet> remove(@Path('id') String id)

  @POST('subnets/{id}?action=deactivate')
  Call<Subnet> deactivate(@Path('id') String id)

}
