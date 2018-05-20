package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.BlkioDeviceOption
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface BlkioDeviceOptionApi {

  @GET('blkioDeviceOptions/{id}')
  Call<BlkioDeviceOption> findById(@Path('id') String id)

}
