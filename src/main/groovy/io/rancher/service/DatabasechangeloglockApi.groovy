package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Databasechangeloglock
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DatabasechangeloglockApi { 
  @GET("databasechangeloglock")
  Call<TypeCollection<Databasechangeloglock>> list()

  @GET("databasechangeloglock")
  Call<TypeCollection<Databasechangeloglock>> query(@QueryMap Map<String, String> filters)

  @GET("databasechangeloglock/{id}")
  Call<Databasechangeloglock> findById(@Path("id") String id)

  @DELETE("databasechangeloglock/{id}")
  Call<Databasechangeloglock> delete(@Path("id") String id)
}
