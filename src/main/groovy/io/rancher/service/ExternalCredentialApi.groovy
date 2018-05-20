package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalCredential
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalCredentialApi {
  @GET('externalCredentials')
  Call<TypeCollection<ExternalCredential>> list()

  @GET('externalCredentials')
  Call<TypeCollection<ExternalCredential>> query(@QueryMap Map<String, String> filters)

  @GET('externalCredentials/{id}')
  Call<ExternalCredential> findById(@Path('id') String id)

}
