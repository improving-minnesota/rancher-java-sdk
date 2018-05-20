package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceConsumeMap
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceConsumeMapApi {
  @GET('serviceConsumeMaps')
  Call<TypeCollection<ServiceConsumeMap>> list()

  @GET('serviceConsumeMaps')
  Call<TypeCollection<ServiceConsumeMap>> query(@QueryMap Map<String, String> filters)

  @GET('serviceConsumeMaps/{id}')
  Call<ServiceConsumeMap> findById(@Path('id') String id)

  @POST('serviceConsumeMaps/{id}?action=remove')
  Call<ServiceConsumeMap> remove(@Path('id') String id)

}
