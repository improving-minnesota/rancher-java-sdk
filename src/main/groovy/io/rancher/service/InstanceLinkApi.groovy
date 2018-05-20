package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.InstanceLink
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InstanceLinkApi {
  @GET('instanceLinks')
  Call<TypeCollection<InstanceLink>> list()

  @GET('instanceLinks')
  Call<TypeCollection<InstanceLink>> query(@QueryMap Map<String, String> filters)

  @GET('instanceLinks/{id}')
  Call<InstanceLink> findById(@Path('id') String id)

  @POST('instanceLinks/{id}?action=activate')
  Call<InstanceLink> activate(@Path('id') String id)

  @POST('instanceLinks/{id}?action=purge')
  Call<InstanceLink> purge(@Path('id') String id)

  @POST('instanceLinks/{id}?action=remove')
  Call<InstanceLink> remove(@Path('id') String id)

  @POST('instanceLinks/{id}?action=deactivate')
  Call<InstanceLink> deactivate(@Path('id') String id)

}
