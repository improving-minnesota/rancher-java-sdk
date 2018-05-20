package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.HostApiProxyToken
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HostApiProxyTokenApi {
  @GET('hostApiProxyTokens')
  Call<TypeCollection<HostApiProxyToken>> list()

  @GET('hostApiProxyTokens')
  Call<TypeCollection<HostApiProxyToken>> query(@QueryMap Map<String, String> filters)

  @GET('hostApiProxyTokens/{id}')
  Call<HostApiProxyToken> findById(@Path('id') String id)

}
