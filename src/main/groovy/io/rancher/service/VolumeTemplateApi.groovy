package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.VolumeTemplate
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface VolumeTemplateApi {
  @GET("volumeTemplate")
  Call<TypeCollection<VolumeTemplate>> list()

  @GET("volumeTemplate")
  Call<TypeCollection<VolumeTemplate>> query(@QueryMap Map<String, String> filters)

  @GET("volumeTemplate/{id}")
  Call<VolumeTemplate> findById(@Path("id") String id)

  @POST("volumeTemplate/{id}?action=activate")
  Call<VolumeTemplate> activate(@Path("id") String id)

  @POST("volumeTemplate/{id}?action=deactivate")
  Call<VolumeTemplate> deactivate(@Path("id") String id)

  @POST("volumeTemplate/{id}?action=purge")
  Call<VolumeTemplate> purge(@Path("id") String id)

  @POST("volumeTemplate/{id}?action=remove")
  Call<VolumeTemplate> remove(@Path("id") String id)
}
