package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Region
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegionApi {
  @GET('regions')
  Call<TypeCollection<Region>> list()

  @GET('regions')
  Call<TypeCollection<Region>> query(@QueryMap Map<String, String> filters)

  @POST('regions')
  Call<Region> create(@Body Region region)

  @GET('regions/{id}')
  Call<Region> findById(@Path('id') String id)

  @PUT('regions/{id}')
  Call<Region> update(@Path('id') String id, @Body Region region)

  @DELETE('regions/{id}')
  Call<Region> delete(@Path('id') String id)

  @POST('regions/{id}?action=activate')
  Call<Region> activate(@Path('id') String id)

  @POST('regions/{id}?action=purge')
  Call<Region> purge(@Path('id') String id)

  @POST('regions/{id}?action=remove')
  Call<Region> remove(@Path('id') String id)

  @POST('regions/{id}?action=deactivate')
  Call<Region> deactivate(@Path('id') String id)

}
