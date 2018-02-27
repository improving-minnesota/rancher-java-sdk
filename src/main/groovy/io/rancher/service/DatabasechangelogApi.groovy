package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Databasechangelog
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DatabasechangelogApi {
  @GET("databasechangelog")
  Call<TypeCollection<Databasechangelog>> list()

  @GET("databasechangelog")
  Call<TypeCollection<Databasechangelog>> query(@QueryMap Map<String, String> filters)
  
  @GET("databasechangelog/{id}")
  Call<Databasechangelog> findById(@Path("id") String id)

  @DELETE("databasechangelog/{id}")
  Call<Databasechangelog> delete(@Path("id") String id)
}
