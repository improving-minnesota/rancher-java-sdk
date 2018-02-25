package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.BlkioDeviceOption
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface BlkioDeviceOptionApi {
  @GET("projects/{projectId}/blkioDeviceOption")
  Call<TypeCollection<BlkioDeviceOption>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/blkioDeviceOption")
  Call<TypeCollection<BlkioDeviceOption>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/blkioDeviceOption")
  Call<BlkioDeviceOption> create(@Path("projectId") String projectId, @Body BlkioDeviceOption blkioDeviceOption)

  @PUT("projects/{projectId}/blkioDeviceOption/{id}")
  Call<BlkioDeviceOption> update(@Path("projectId") String projectId, @Path("id") String id, @Body BlkioDeviceOption blkioDeviceOption)

  @DELETE("projects/{projectId}/blkioDeviceOption/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
