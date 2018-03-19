package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ServiceExposeMap
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceExposeMapApi {
  @GET('serviceExposeMaps')
  Call<TypeCollection<ServiceExposeMap>> list()

  @GET('serviceExposeMaps')
  Call<TypeCollection<ServiceExposeMap>> query(@QueryMap Map<String, String> filters)

  @GET('serviceExposeMaps/{id}')
  Call<ServiceExposeMap> findById(@Path('id') String id)

  @POST('serviceExposeMaps/{id}?action=remove')
  Call<ServiceExposeMap> remove(@Path('id') String id)

}
