package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceEvent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceEventApi {
  @GET('serviceEvents')
  Call<TypeCollection<ServiceEvent>> list()

  @GET('serviceEvents')
  Call<TypeCollection<ServiceEvent>> query(@QueryMap Map<String, String> filters)

  @GET('serviceEvents/{id}')
  Call<ServiceEvent> findById(@Path('id') String id)

  @POST('serviceEvents/{id}?action=remove')
  Call<ServiceEvent> remove(@Path('id') String id)

}
