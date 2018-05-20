package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Password
import io.rancher.type.Credential
import io.rancher.type.ChangeSecretInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PasswordApi {
  @GET('passwords')
  Call<TypeCollection<Password>> list()

  @GET('passwords')
  Call<TypeCollection<Password>> query(@QueryMap Map<String, String> filters)

  @POST('passwords')
  Call<Password> create(@Body Password password)

  @GET('passwords/{id}')
  Call<Password> findById(@Path('id') String id)

  @PUT('passwords/{id}')
  Call<Password> update(@Path('id') String id, @Body Password password)

  @DELETE('passwords/{id}')
  Call<Password> delete(@Path('id') String id)

  @POST('passwords/{id}?action=activate')
  Call<Credential> activate(@Path('id') String id)

  @POST('passwords/{id}?action=purge')
  Call<Credential> purge(@Path('id') String id)

  @POST('passwords/{id}?action=remove')
  Call<Credential> remove(@Path('id') String id)

  @POST('passwords/{id}?action=deactivate')
  Call<Credential> deactivate(@Path('id') String id)

  @POST('passwords/{id}?action=changesecret')
  Call<ChangeSecretInput> changesecret(@Path('id') String id, @Body ChangeSecretInput changeSecretInput)
}
