package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.HostTemplate
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HostTemplateApi {
  @GET("hostTemplate")
  Call<TypeCollection<HostTemplate>> list()

  @GET("hostTemplate")
  Call<TypeCollection<HostTemplate>> query(@QueryMap Map<String, String> filters)

  @GET("hostTemplate/{id}")
  Call<HostTemplate> findById(@Path("id") String id)

  @POST("hostTemplate/{id}?action=remove")
  Call<HostTemplate> remove(@Path("id") String id)
}
