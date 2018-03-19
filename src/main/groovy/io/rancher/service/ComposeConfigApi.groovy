package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ComposeConfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ComposeConfigApi {

  @GET('composeConfigs/{id}')
  Call<ComposeConfig> findById(@Path('id') String id)

}
