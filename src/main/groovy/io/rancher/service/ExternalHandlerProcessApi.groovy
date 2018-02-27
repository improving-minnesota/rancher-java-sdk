package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalHandlerProcess
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalHandlerProcessApi {
  @GET("externalHandlerProcess")
  Call<TypeCollection<ExternalHandlerProcess>> list()

  @GET("externalHandlerProcess")
  Call<TypeCollection<ExternalHandlerProcess>> query(@QueryMap Map<String, String> filters)
  
  @GET("externalHandlerProcess/{id}")
  Call<ExternalHandlerProcess> findById(@Path("id") String id)

  @POST("externalHandlerProcess/{id}?action=activate")
  Call<ExternalHandlerProcess> activate(@Path("id") String id)

  @POST("externalHandlerProcess/{id}?action=deactivate")
  Call<ExternalHandlerProcess> deactivate(@Path("id") String id)

  @POST("externalHandlerProcess/{id}?action=purge")
  Call<ExternalHandlerProcess> purge(@Path("id") String id)

  @POST("externalHandlerProcess/{id}?action=remove")
  Call<ExternalHandlerProcess> remove(@Path("id") String id)
}
