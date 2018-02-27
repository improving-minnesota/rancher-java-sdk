package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Credential
import io.rancher.type.RegistryCredential
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegistryCredentialApi { 
  @GET("registryCredential")
  Call<TypeCollection<RegistryCredential>> list()

  @GET("registryCredential")
  Call<TypeCollection<RegistryCredential>> query(@QueryMap Map<String, String> filters)

  @GET("registryCredential/{id}")
  Call<RegistryCredential> findById(@Path("id") String id)

  @POST("registryCredential/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id)

  @POST("registryCredential/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id)

  @POST("registryCredential/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id)

  @POST("registryCredential/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id)
}
