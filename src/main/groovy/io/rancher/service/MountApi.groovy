package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Mount
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface MountApi { 
  @GET("mount")
  Call<TypeCollection<Mount>> list()

  @GET("mount")
  Call<TypeCollection<Mount>> query(@QueryMap Map<String, String> filters)
  
  @GET("mount/{id}")
  Call<Mount> findById(@Path("id") String id)

  @POST("mount/{id}?action=deactivate")
  Call<Mount> deactivate(@Path("id") String id)

  @POST("mount/{id}?action=remove")
  Call<Mount> remove(@Path("id") String id)
}
