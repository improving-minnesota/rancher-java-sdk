package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.StorageDriver
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface StorageDriverApi {
  @GET('storageDrivers')
  Call<TypeCollection<StorageDriver>> list()

  @GET('storageDrivers')
  Call<TypeCollection<StorageDriver>> query(@QueryMap Map<String, String> filters)

  @GET('storageDrivers/{id}')
  Call<StorageDriver> findById(@Path('id') String id)

  @POST('storageDrivers/{id}?action=activate')
  Call<StorageDriver> activate(@Path('id') String id)

  @POST('storageDrivers/{id}?action=remove')
  Call<StorageDriver> remove(@Path('id') String id)

  @POST('storageDrivers/{id}?action=deactivate')
  Call<StorageDriver> deactivate(@Path('id') String id)

}
