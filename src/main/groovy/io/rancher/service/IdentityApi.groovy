package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Identity
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface IdentityApi {
  @GET("identity")
  Call<TypeCollection<Identity>> list()

  @GET("identity")
  Call<TypeCollection<Identity>> query(@QueryMap Map<String, String> filters)

  @GET("identity/{id}")
  Call<Identity> findById(@Path("id") String id)
}
