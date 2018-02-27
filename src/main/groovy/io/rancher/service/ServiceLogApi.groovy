package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceLog
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceLogApi {
  @GET("serviceLog")
  Call<TypeCollection<ServiceLog>> list()

  @GET("serviceLog")
  Call<TypeCollection<ServiceLog>> query(@QueryMap Map<String, String> filters)
  
  @GET("serviceLog/{id}")
  Call<ServiceLog> findById(@Path("id") String id)
}
