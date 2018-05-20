package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Identity
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface IdentityApi {
  @GET('identities')
  Call<TypeCollection<Identity>> list()

  @GET('identities')
  Call<TypeCollection<Identity>> query(@QueryMap Map<String, String> filters)

  @GET('identities/{id}')
  Call<Identity> findById(@Path('id') String id)

}
