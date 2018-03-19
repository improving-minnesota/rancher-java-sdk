package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Network
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkApi {
  @GET('networks')
  Call<TypeCollection<Network>> list()

  @GET('networks')
  Call<TypeCollection<Network>> query(@QueryMap Map<String, String> filters)

  @GET('networks/{id}')
  Call<Network> findById(@Path('id') String id)

  @POST('networks/{id}?action=activate')
  Call<Network> activate(@Path('id') String id)

  @POST('networks/{id}?action=purge')
  Call<Network> purge(@Path('id') String id)

  @POST('networks/{id}?action=remove')
  Call<Network> remove(@Path('id') String id)

  @POST('networks/{id}?action=deactivate')
  Call<Network> deactivate(@Path('id') String id)

}
