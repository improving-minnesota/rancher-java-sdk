package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ConfigItemStatus
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ConfigItemStatusApi {
  @GET('configItemStatuses')
  Call<TypeCollection<ConfigItemStatus>> list()

  @GET('configItemStatuses')
  Call<TypeCollection<ConfigItemStatus>> query(@QueryMap Map<String, String> filters)

  @GET('configItemStatuses/{id}')
  Call<ConfigItemStatus> findById(@Path('id') String id)

  @PUT('configItemStatuses/{id}')
  Call<ConfigItemStatus> update(@Path('id') String id, @Body ConfigItemStatus configItemStatus)

}
