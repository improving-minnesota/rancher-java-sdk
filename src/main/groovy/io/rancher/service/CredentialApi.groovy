package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Credential
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface CredentialApi {
  @GET("credential")
  Call<TypeCollection<Credential>> list()

  @GET("credential")
  Call<TypeCollection<Credential>> query(@QueryMap Map<String, String> filters)

  @POST("credential")
  Call<Credential> create(@Body Credential credential)
  
  @GET("credential/{id}")
  Call<Credential> findById(@Path("id") String id)

  @POST("credential/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id)

  @POST("credential/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id)

  @POST("credential/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id)

  @POST("credential/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id)
}
