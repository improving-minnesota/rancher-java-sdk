package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.BackupTarget
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface BackupTargetApi {
  @GET("backupTarget")
  Call<TypeCollection<BackupTarget>> list()

  @GET("backupTarget")
  Call<TypeCollection<BackupTarget>> query(@QueryMap Map<String, String> filters)
  
  @GET("backupTarget/{id}")
  Call<BackupTarget> findById(@Path("id") String id)

  @POST("backupTarget/{id}?action=remove")
  Call<BackupTarget> remove(@Path("id") String id)
}
