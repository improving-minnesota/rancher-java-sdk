package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceProxy
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceProxyApi {
  @GET("serviceProxy")
  Call<TypeCollection<ServiceProxy>> list()

  @GET("serviceProxy")
  Call<TypeCollection<ServiceProxy>> query(@QueryMap Map<String, String> filters)
  
  @GET("serviceProxy/{id}")
  Call<ServiceProxy> findById(@Path("id") String id)
}
