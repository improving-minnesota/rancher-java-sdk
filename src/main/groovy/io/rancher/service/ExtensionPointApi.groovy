package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExtensionPoint
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExtensionPointApi {
  @GET('extensionPoints')
  Call<TypeCollection<ExtensionPoint>> list()

  @GET('extensionPoints')
  Call<TypeCollection<ExtensionPoint>> query(@QueryMap Map<String, String> filters)

  @GET('extensionPoints/{id}')
  Call<ExtensionPoint> findById(@Path('id') String id)

}
