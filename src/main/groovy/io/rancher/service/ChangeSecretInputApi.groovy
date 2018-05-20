package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ChangeSecretInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ChangeSecretInputApi {

  @POST('changeSecretInputs')
  Call<ChangeSecretInput> create(@Body ChangeSecretInput changeSecretInput)

  @GET('changeSecretInputs/{id}')
  Call<ChangeSecretInput> findById(@Path('id') String id)

}
