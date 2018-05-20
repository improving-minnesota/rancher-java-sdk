package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalVolumeEvent
import io.rancher.type.ExternalEvent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalVolumeEventApi {
  @GET('externalVolumeEvents')
  Call<TypeCollection<ExternalVolumeEvent>> list()

  @GET('externalVolumeEvents')
  Call<TypeCollection<ExternalVolumeEvent>> query(@QueryMap Map<String, String> filters)

  @GET('externalVolumeEvents/{id}')
  Call<ExternalVolumeEvent> findById(@Path('id') String id)

  @POST('externalVolumeEvents/{id}?action=remove')
  Call<ExternalEvent> remove(@Path('id') String id)

}
