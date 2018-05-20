package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Certificate
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface CertificateApi {
  @GET('certificates')
  Call<TypeCollection<Certificate>> list()

  @GET('certificates')
  Call<TypeCollection<Certificate>> query(@QueryMap Map<String, String> filters)

  @GET('certificates/{id}')
  Call<Certificate> findById(@Path('id') String id)

  @POST('certificates/{id}?action=remove')
  Call<Certificate> remove(@Path('id') String id)

}
