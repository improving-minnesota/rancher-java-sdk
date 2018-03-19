package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Image
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ImageApi {
  @GET('images')
  Call<TypeCollection<Image>> list()

  @GET('images')
  Call<TypeCollection<Image>> query(@QueryMap Map<String, String> filters)

  @GET('images/{id}')
  Call<Image> findById(@Path('id') String id)

  @POST('images/{id}?action=activate')
  Call<Image> activate(@Path('id') String id)

  @POST('images/{id}?action=purge')
  Call<Image> purge(@Path('id') String id)

  @POST('images/{id}?action=remove')
  Call<Image> remove(@Path('id') String id)

  @POST('images/{id}?action=deactivate')
  Call<Image> deactivate(@Path('id') String id)

}
