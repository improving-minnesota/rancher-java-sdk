package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServicesPortRange
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServicesPortRangeApi {

  @POST('servicesPortRanges')
  Call<ServicesPortRange> create(@Body ServicesPortRange servicesPortRange)

  @GET('servicesPortRanges/{id}')
  Call<ServicesPortRange> findById(@Path('id') String id)

  @PUT('servicesPortRanges/{id}')
  Call<ServicesPortRange> update(@Path('id') String id, @Body ServicesPortRange servicesPortRange)

}
