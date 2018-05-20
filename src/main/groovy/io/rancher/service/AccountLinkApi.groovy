package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.AccountLink
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AccountLinkApi {
  @GET('accountLinks')
  Call<TypeCollection<AccountLink>> list()

  @GET('accountLinks')
  Call<TypeCollection<AccountLink>> query(@QueryMap Map<String, String> filters)

  @GET('accountLinks/{id}')
  Call<AccountLink> findById(@Path('id') String id)

  @POST('accountLinks/{id}?action=activate')
  Call<AccountLink> activate(@Path('id') String id)

  @POST('accountLinks/{id}?action=purge')
  Call<AccountLink> purge(@Path('id') String id)

  @POST('accountLinks/{id}?action=remove')
  Call<AccountLink> remove(@Path('id') String id)

  @POST('accountLinks/{id}?action=deactivate')
  Call<AccountLink> deactivate(@Path('id') String id)

}
