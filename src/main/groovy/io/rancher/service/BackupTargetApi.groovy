package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.BackupTarget
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface BackupTargetApi {
  @GET('backupTargets')
  Call<TypeCollection<BackupTarget>> list()

  @GET('backupTargets')
  Call<TypeCollection<BackupTarget>> query(@QueryMap Map<String, String> filters)

  @GET('backupTargets/{id}')
  Call<BackupTarget> findById(@Path('id') String id)

  @POST('backupTargets/{id}?action=remove')
  Call<BackupTarget> remove(@Path('id') String id)

}
