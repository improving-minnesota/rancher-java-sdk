package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalDnsEvent
import io.rancher.type.ExternalEvent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalDnsEventApi {
  @GET('externalDnsEvents')
  Call<TypeCollection<ExternalDnsEvent>> list()

  @GET('externalDnsEvents')
  Call<TypeCollection<ExternalDnsEvent>> query(@QueryMap Map<String, String> filters)

  @GET('externalDnsEvents/{id}')
  Call<ExternalDnsEvent> findById(@Path('id') String id)

  @POST('externalDnsEvents/{id}?action=remove')
  Call<ExternalEvent> remove(@Path('id') String id)

}
