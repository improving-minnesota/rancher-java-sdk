package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Credential
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface CredentialApi {
  @GET('credentials')
  Call<TypeCollection<Credential>> list()

  @GET('credentials')
  Call<TypeCollection<Credential>> query(@QueryMap Map<String, String> filters)

  @POST('credentials')
  Call<Credential> create(@Body Credential credential)

  @GET('credentials/{id}')
  Call<Credential> findById(@Path('id') String id)

  @POST('credentials/{id}?action=activate')
  Call<Credential> activate(@Path('id') String id)

  @POST('credentials/{id}?action=purge')
  Call<Credential> purge(@Path('id') String id)

  @POST('credentials/{id}?action=remove')
  Call<Credential> remove(@Path('id') String id)

  @POST('credentials/{id}?action=deactivate')
  Call<Credential> deactivate(@Path('id') String id)

}
