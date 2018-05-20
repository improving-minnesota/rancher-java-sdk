package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.LocalAuthConfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LocalAuthConfigApi {
  @GET('localAuthConfigs')
  Call<TypeCollection<LocalAuthConfig>> list()

  @GET('localAuthConfigs')
  Call<TypeCollection<LocalAuthConfig>> query(@QueryMap Map<String, String> filters)

  @POST('localAuthConfigs')
  Call<LocalAuthConfig> create(@Body LocalAuthConfig localAuthConfig)

  @GET('localAuthConfigs/{id}')
  Call<LocalAuthConfig> findById(@Path('id') String id)

}
