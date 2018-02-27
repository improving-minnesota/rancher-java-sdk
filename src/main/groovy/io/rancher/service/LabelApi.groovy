package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Label
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LabelApi {
  @GET("label")
  Call<TypeCollection<Label>> list()

  @GET("label")
  Call<TypeCollection<Label>> query(@QueryMap Map<String, String> filters)

  @GET("label/{id}")
  Call<Label> findById(@Path("id") String id)

  @POST("label/{id}?action=remove")
  Call<Label> remove(@Path("id") String id)
}
