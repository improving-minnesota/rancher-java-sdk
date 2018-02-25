package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.IpAddress
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface IpAddressApi {
  @GET("projects/{projectId}/ipAddress")
  Call<TypeCollection<IpAddress>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/ipAddress")
  Call<TypeCollection<IpAddress>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/ipAddress/{id}")
  Call<IpAddress> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ipAddress")
  Call<IpAddress> create(@Path("projectId") String projectId, @Body IpAddress ipAddress)

  @PUT("projects/{projectId}/ipAddress/{id}")
  Call<IpAddress> update(@Path("projectId") String projectId, @Path("id") String id, @Body IpAddress ipAddress)

  @DELETE("projects/{projectId}/ipAddress/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ipAddress/{id}?action=activate")
  Call<IpAddress> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ipAddress/{id}?action=associate")
  Call<IpAddress> associate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ipAddress/{id}?action=deactivate")
  Call<IpAddress> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ipAddress/{id}?action=disassociate")
  Call<IpAddress> disassociate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ipAddress/{id}?action=purge")
  Call<IpAddress> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/ipAddress/{id}?action=remove")
  Call<IpAddress> remove(@Path("projectId") String projectId, @Path("id") String id)
}
