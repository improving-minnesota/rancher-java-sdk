package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.RegistryCredential
import io.rancher.type.Credential
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegistryCredentialApi {
  @GET('registryCredentials')
  Call<TypeCollection<RegistryCredential>> list()

  @GET('registryCredentials')
  Call<TypeCollection<RegistryCredential>> query(@QueryMap Map<String, String> filters)

  @GET('registryCredentials/{id}')
  Call<RegistryCredential> findById(@Path('id') String id)

  @POST('registryCredentials/{id}?action=activate')
  Call<Credential> activate(@Path('id') String id)

  @POST('registryCredentials/{id}?action=purge')
  Call<Credential> purge(@Path('id') String id)

  @POST('registryCredentials/{id}?action=remove')
  Call<Credential> remove(@Path('id') String id)

  @POST('registryCredentials/{id}?action=deactivate')
  Call<Credential> deactivate(@Path('id') String id)

}
