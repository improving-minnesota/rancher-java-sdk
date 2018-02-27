package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceConsumeMap
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceConsumeMapApi { 
  @GET("serviceConsumeMap")
  Call<TypeCollection<ServiceConsumeMap>> list()

  @GET("serviceConsumeMap")
  Call<TypeCollection<ServiceConsumeMap>> query(@QueryMap Map<String, String> filters)

  @GET("serviceConsumeMap/{id}")
  Call<ServiceConsumeMap> findById(@Path("id") String id)

  @POST("serviceConsumeMap/{id}?action=remove")
  Call<ServiceConsumeMap> remove(@Path("id") String id)
}
