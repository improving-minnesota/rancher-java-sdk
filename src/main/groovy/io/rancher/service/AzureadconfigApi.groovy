package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Azureadconfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AzureadconfigApi {
  @GET("azureadconfig")
  Call<TypeCollection<Azureadconfig>> list()

  @GET("azureadconfig")
  Call<TypeCollection<Azureadconfig>> query(@QueryMap Map<String, String> filters)

  @POST("azureadconfig")
  Call<Azureadconfig> create(@Body Azureadconfig azureadconfig)

  @GET("azureadconfig/{id}")
  Call<Azureadconfig> findById(@Path("id") String id)

  @PUT("azureadconfig/{id}")
  Call<Azureadconfig> update(@Path("id") String id, @Body Azureadconfig azureadconfig)
}
