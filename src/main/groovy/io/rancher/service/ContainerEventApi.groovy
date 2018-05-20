package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ContainerEvent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ContainerEventApi {
  @GET('containerEvents')
  Call<TypeCollection<ContainerEvent>> list()

  @GET('containerEvents')
  Call<TypeCollection<ContainerEvent>> query(@QueryMap Map<String, String> filters)

  @GET('containerEvents/{id}')
  Call<ContainerEvent> findById(@Path('id') String id)

  @POST('containerEvents/{id}?action=remove')
  Call<ContainerEvent> remove(@Path('id') String id)

}
