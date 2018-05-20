package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Label
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LabelApi {
  @GET('labels')
  Call<TypeCollection<Label>> list()

  @GET('labels')
  Call<TypeCollection<Label>> query(@QueryMap Map<String, String> filters)

  @GET('labels/{id}')
  Call<Label> findById(@Path('id') String id)

  @POST('labels/{id}?action=remove')
  Call<Label> remove(@Path('id') String id)

}
