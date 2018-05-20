package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalEventApi {
  @GET('externalEvents')
  Call<TypeCollection<ExternalEvent>> list()

  @GET('externalEvents')
  Call<TypeCollection<ExternalEvent>> query(@QueryMap Map<String, String> filters)

  @GET('externalEvents/{id}')
  Call<ExternalEvent> findById(@Path('id') String id)

  @POST('externalEvents/{id}?action=remove')
  Call<ExternalEvent> remove(@Path('id') String id)

}
