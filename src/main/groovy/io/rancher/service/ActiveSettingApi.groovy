package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ActiveSetting
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ActiveSettingApi {

  @GET('activeSettings/{id}')
  Call<ActiveSetting> findById(@Path('id') String id)

  @PUT('activeSettings/{id}')
  Call<ActiveSetting> update(@Path('id') String id, @Body ActiveSetting activeSetting)

  @DELETE('activeSettings/{id}')
  Call<ActiveSetting> delete(@Path('id') String id)

}
