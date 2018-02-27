package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.StorageDriver
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface StorageDriverApi {
  @GET("storageDriver")
  Call<TypeCollection<StorageDriver>> list()

  @GET("storageDriver")
  Call<TypeCollection<StorageDriver>> query(@QueryMap Map<String, String> filters)

  @GET("storageDriver/{id}")
  Call<StorageDriver> findById(@Path("id") String id)

  @POST("storageDriver/{id}?action=activate")
  Call<StorageDriver> activate(@Path("id") String id)

  @POST("storageDriver/{id}?action=deactivate")
  Call<StorageDriver> deactivate(@Path("id") String id)

  @POST("storageDriver/{id}?action=remove")
  Call<StorageDriver> remove(@Path("id") String id)
}
