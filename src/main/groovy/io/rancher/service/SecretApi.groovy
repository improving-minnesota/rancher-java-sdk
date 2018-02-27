package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Secret
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SecretApi {
  @GET("secret")
  Call<TypeCollection<Secret>> list()

  @GET("secret")
  Call<TypeCollection<Secret>> query(@QueryMap Map<String, String> filters)
  
  @GET("secret/{id}")
  Call<Secret> findById(@Path("id") String id)

  @POST("secret/{id}?action=remove")
  Call<Secret> remove(@Path("id") String id)
}
