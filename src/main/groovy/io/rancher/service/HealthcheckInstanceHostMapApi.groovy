package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.HealthcheckInstanceHostMap
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HealthcheckInstanceHostMapApi { 
  @GET("healthcheckInstanceHostMap")
  Call<TypeCollection<HealthcheckInstanceHostMap>> list()

  @GET("healthcheckInstanceHostMap")
  Call<TypeCollection<HealthcheckInstanceHostMap>> query(@QueryMap Map<String, String> filters)

  @GET("healthcheckInstanceHostMap/{id}")
  Call<HealthcheckInstanceHostMap> findById(@Path("id") String id)

  @POST("healthcheckInstanceHostMap/{id}?action=remove")
  Call<HealthcheckInstanceHostMap> remove(@Path("id") String id)
}
