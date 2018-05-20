package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.HaConfig
import io.rancher.type.HaConfigInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HaConfigApi {
  @GET('haConfigs')
  Call<TypeCollection<HaConfig>> list()

  @GET('haConfigs')
  Call<TypeCollection<HaConfig>> query(@QueryMap Map<String, String> filters)

  @GET('haConfigs/{id}')
  Call<HaConfig> findById(@Path('id') String id)

  @PUT('haConfigs/{id}')
  Call<HaConfig> update(@Path('id') String id, @Body HaConfig haConfig)

}
