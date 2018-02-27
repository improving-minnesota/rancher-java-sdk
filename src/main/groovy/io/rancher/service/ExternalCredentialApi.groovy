package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalCredential
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalCredentialApi { 
  @GET("externalCredential")
  Call<TypeCollection<ExternalCredential>> list()

  @GET("externalCredential")
  Call<TypeCollection<ExternalCredential>> query(@QueryMap Map<String, String> filters)
  
  @GET("externalCredential/{id}")
  Call<ExternalCredential> findById(@Path("id") String id)
}
