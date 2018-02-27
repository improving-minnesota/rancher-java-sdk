package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.InstanceLink
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InstanceLinkApi {
  @GET("instanceLink")
  Call<TypeCollection<InstanceLink>> list()

  @GET("instanceLink")
  Call<TypeCollection<InstanceLink>> query(@QueryMap Map<String, String> filters)
  
  @GET("instanceLink/{id}")
  Call<InstanceLink> findById(@Path("id") String id)

  @POST("instanceLink/{id}?action=activate")
  Call<InstanceLink> activate(@Path("id") String id)

  @POST("instanceLink/{id}?action=deactivate")
  Call<InstanceLink> deactivate(@Path("id") String id)

  @POST("instanceLink/{id}?action=purge")
  Call<InstanceLink> purge(@Path("id") String id)

  @POST("instanceLink/{id}?action=remove")
  Call<InstanceLink> remove(@Path("id") String id)
}
