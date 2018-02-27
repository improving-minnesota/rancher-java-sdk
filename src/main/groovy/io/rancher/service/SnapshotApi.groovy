package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Backup
import io.rancher.type.Snapshot
import io.rancher.type.SnapshotBackupInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SnapshotApi {
  @GET("snapshot")
  Call<TypeCollection<Snapshot>> list()

  @GET("snapshot")
  Call<TypeCollection<Snapshot>> query(@QueryMap Map<String, String> filters)

  @GET("snapshot/{id}")
  Call<Snapshot> findById(@Path("id") String id)

  @POST("snapshot/{id}?action=backup")
  Call<Backup> backup(@Path("id") String id, @Body SnapshotBackupInput snapshotBackupInput)

  @POST("snapshot/{id}?action=remove")
  Call<Snapshot> remove(@Path("id") String id)
}
