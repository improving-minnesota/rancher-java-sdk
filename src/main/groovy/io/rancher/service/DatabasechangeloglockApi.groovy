package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Databasechangeloglock
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DatabasechangeloglockApi {
  @GET('databasechangeloglocks')
  Call<TypeCollection<Databasechangeloglock>> list()

  @GET('databasechangeloglocks')
  Call<TypeCollection<Databasechangeloglock>> query(@QueryMap Map<String, String> filters)

  @GET('databasechangeloglocks/{id}')
  Call<Databasechangeloglock> findById(@Path('id') String id)

  @DELETE('databasechangeloglocks/{id}')
  Call<Databasechangeloglock> delete(@Path('id') String id)

}
