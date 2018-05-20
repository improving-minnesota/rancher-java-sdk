package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Openldapconfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface OpenldapconfigApi {
  @GET('openldapconfigs')
  Call<TypeCollection<Openldapconfig>> list()

  @GET('openldapconfigs')
  Call<TypeCollection<Openldapconfig>> query(@QueryMap Map<String, String> filters)

  @POST('openldapconfigs')
  Call<Openldapconfig> create(@Body Openldapconfig openldapconfig)

  @GET('openldapconfigs/{id}')
  Call<Openldapconfig> findById(@Path('id') String id)

  @PUT('openldapconfigs/{id}')
  Call<Openldapconfig> update(@Path('id') String id, @Body Openldapconfig openldapconfig)

}
