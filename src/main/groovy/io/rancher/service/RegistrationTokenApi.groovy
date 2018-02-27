package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Credential
import io.rancher.type.RegistrationToken
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegistrationTokenApi { 
  @GET("registrationToken")
  Call<TypeCollection<RegistrationToken>> list()

  @GET("registrationToken")
  Call<TypeCollection<RegistrationToken>> query(@QueryMap Map<String, String> filters)

  @GET("registrationToken/{id}")
  Call<RegistrationToken> findById(@Path("id") String id)

  @POST("registrationToken/{id}?action=activate")
  Call<Credential> activate(@Path("id") String id)

  @POST("registrationToken/{id}?action=deactivate")
  Call<Credential> deactivate(@Path("id") String id)

  @POST("registrationToken/{id}?action=purge")
  Call<Credential> purge(@Path("id") String id)

  @POST("registrationToken/{id}?action=remove")
  Call<Credential> remove(@Path("id") String id)
}
