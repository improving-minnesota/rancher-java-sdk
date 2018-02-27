package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ApiKey
import io.rancher.type.Credential
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ApiKeyApi {
  @GET("apiKey")
  Call<TypeCollection<ApiKey>> list()

  @GET("apiKey")
  Call<TypeCollection<ApiKey>> query(@QueryMap Map<String, String> filters)

  @POST("apiKey")
  Call<ApiKey> create(@Body ApiKey apiKey)
  
  @GET("apiKey/{id}")
  Call<ApiKey> findById(@Path("id") String id)

  @PUT("apiKey/{id}")
  Call<ApiKey> update(@Path("id") String id, @Body ApiKey apiKey)

  @DELETE("apiKey/{id}")
  Call<ApiKey> delete(@Path("id") String id)

  @POST("apiKey/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id)

  @POST("apiKey/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id)

  @POST("apiKey/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id)

  @POST("apiKey/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id)
}
