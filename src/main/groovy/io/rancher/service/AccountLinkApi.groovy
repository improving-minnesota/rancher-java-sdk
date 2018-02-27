package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.AccountLink
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AccountLinkApi {
  @GET("accountLink")
  Call<TypeCollection<AccountLink>> list()

  @GET("accountLink")
  Call<TypeCollection<AccountLink>> query(@QueryMap Map<String, String> filters)

  @GET("accountLink/{id}")
  Call<AccountLink> findById(@Path("id") String id)

  @POST("accountLink/{id}?action=activate")
  Call<AccountLink> activate(@Path("id") String id)

  @POST("accountLink/{id}?action=deactivate")
  Call<AccountLink> deactivate(@Path("id") String id)

  @POST("accountLink/{id}?action=purge")
  Call<AccountLink> purge(@Path("id") String id)

  @POST("accountLink/{id}?action=remove")
  Call<AccountLink> remove(@Path("id") String id)
}
