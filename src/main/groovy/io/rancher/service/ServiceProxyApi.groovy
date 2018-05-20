package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceProxy
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceProxyApi {
  @GET('serviceProxies')
  Call<TypeCollection<ServiceProxy>> list()

  @GET('serviceProxies')
  Call<TypeCollection<ServiceProxy>> query(@QueryMap Map<String, String> filters)

  @GET('serviceProxies/{id}')
  Call<ServiceProxy> findById(@Path('id') String id)

}
