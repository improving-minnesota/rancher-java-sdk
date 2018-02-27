package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Certificate
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface CertificateApi {
  @GET("certificate")
  Call<TypeCollection<Certificate>> list()

  @GET("certificate")
  Call<TypeCollection<Certificate>> query(@QueryMap Map<String, String> filters)
  
  @GET("certificate/{id}")
  Call<Certificate> findById(@Path("id") String id)

  @POST("certificate/{id}?action=remove")
  Call<Certificate> remove(@Path("id") String id)
}
