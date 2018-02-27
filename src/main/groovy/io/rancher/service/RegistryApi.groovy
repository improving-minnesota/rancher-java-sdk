package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Registry
import io.rancher.type.StoragePool
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegistryApi {
  @GET("registry")
  Call<TypeCollection<Registry>> list()

  @GET("registry")
  Call<TypeCollection<Registry>> query(@QueryMap Map<String, String> filters)

  @GET("registry/{id}")
  Call<Registry> findById(@Path("id") String id)

  @POST("registry/{id}?action=activate")
  Call<StoragePool> activate(@Path("id") String id)

  @POST("registry/{id}?action=deactivate")
  Call<StoragePool> deactivate(@Path("id") String id)

  @POST("registry/{id}?action=purge")
  Call<StoragePool> purge(@Path("id") String id)

  @POST("registry/{id}?action=remove")
  Call<StoragePool> remove(@Path("id") String id)
}
