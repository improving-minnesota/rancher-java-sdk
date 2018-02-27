package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalHandlerExternalHandlerProcessMap
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalHandlerExternalHandlerProcessMapApi { 
  @GET("externalHandlerExternalHandlerProcessMap")
  Call<TypeCollection<ExternalHandlerExternalHandlerProcessMap>> list()

  @GET("externalHandlerExternalHandlerProcessMap")
  Call<TypeCollection<ExternalHandlerExternalHandlerProcessMap>> query(@QueryMap Map<String, String> filters)

  @GET("externalHandlerExternalHandlerProcessMap/{id}")
  Call<ExternalHandlerExternalHandlerProcessMap> findById(@Path("id") String id)

  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=activate")
  Call<ExternalHandlerExternalHandlerProcessMap> activate(@Path("id") String id)

  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=deactivate")
  Call<ExternalHandlerExternalHandlerProcessMap> deactivate(@Path("id") String id)

  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=purge")
  Call<ExternalHandlerExternalHandlerProcessMap> purge(@Path("id") String id)

  @POST("externalHandlerExternalHandlerProcessMap/{id}?action=remove")
  Call<ExternalHandlerExternalHandlerProcessMap> remove(@Path("id") String id)
}
