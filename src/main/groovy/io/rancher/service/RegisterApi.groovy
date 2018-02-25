package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.GenericObject
import io.rancher.type.Instance
import io.rancher.type.InstanceStop
import io.rancher.type.Register
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegisterApi {
  @GET("projects/{projectId}/register")
  Call<TypeCollection<Register>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/register")
  Call<TypeCollection<Register>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/register/{id}")
  Call<Register> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/register")
  Call<Register> create(@Path("projectId") String projectId, @Body Register register)

  @PUT("projects/{projectId}/register/{id}")
  Call<Register> update(@Path("projectId") String projectId, @Path("id") String id, @Body Register register)

  @DELETE("projects/{projectId}/register/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/register/{id}?action=remove")
  Call<GenericObject> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/register/{id}?action=stop")
  Call<Instance> stop(@Path("projectId") String projectId, @Path("id") String id, @Body InstanceStop instanceStop)
}
