package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.DefaultNetwork
import io.rancher.type.Network
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DefaultNetworkApi {

  @GET('defaultNetworks/{id}')
  Call<DefaultNetwork> findById(@Path('id') String id)

  @POST('defaultNetworks/{id}?action=activate')
  Call<Network> activate(@Path('id') String id)

  @POST('defaultNetworks/{id}?action=purge')
  Call<Network> purge(@Path('id') String id)

  @POST('defaultNetworks/{id}?action=remove')
  Call<Network> remove(@Path('id') String id)

  @POST('defaultNetworks/{id}?action=deactivate')
  Call<Network> deactivate(@Path('id') String id)

}
