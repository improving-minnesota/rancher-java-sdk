package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalServiceEvent
import io.rancher.type.ExternalEvent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalServiceEventApi {
  @GET('externalServiceEvents')
  Call<TypeCollection<ExternalServiceEvent>> list()

  @GET('externalServiceEvents')
  Call<TypeCollection<ExternalServiceEvent>> query(@QueryMap Map<String, String> filters)

  @GET('externalServiceEvents/{id}')
  Call<ExternalServiceEvent> findById(@Path('id') String id)

  @POST('externalServiceEvents/{id}?action=remove')
  Call<ExternalEvent> remove(@Path('id') String id)

}
