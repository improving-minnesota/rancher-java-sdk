package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Backup
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface BackupApi { 
  @GET("backup")
  Call<TypeCollection<Backup>> list()

  @GET("backup")
  Call<TypeCollection<Backup>> query(@QueryMap Map<String, String> filters)
  
  @GET("backup/{id}")
  Call<Backup> findById(@Path("id") String id)

  @POST("backup/{id}?action=remove")
  Call<Backup> remove(@Path("id") String id)
}
