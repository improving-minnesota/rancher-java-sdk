package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.HealthcheckInstanceHostMap
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HealthcheckInstanceHostMapApi {
  @GET('healthcheckInstanceHostMaps')
  Call<TypeCollection<HealthcheckInstanceHostMap>> list()

  @GET('healthcheckInstanceHostMaps')
  Call<TypeCollection<HealthcheckInstanceHostMap>> query(@QueryMap Map<String, String> filters)

  @GET('healthcheckInstanceHostMaps/{id}')
  Call<HealthcheckInstanceHostMap> findById(@Path('id') String id)

  @POST('healthcheckInstanceHostMaps/{id}?action=remove')
  Call<HealthcheckInstanceHostMap> remove(@Path('id') String id)

}
