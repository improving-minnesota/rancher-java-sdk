package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Port
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface PortApi {
  @GET("projects/{projectId}/port")
  Call<TypeCollection<Port>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/port")
  Call<TypeCollection<Port>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/port/{id}")
  Call<Port> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/port")
  Call<Port> create(@Path("projectId") String projectId, @Body Port port)

  @PUT("projects/{projectId}/port/{id}")
  Call<Port> update(@Path("projectId") String projectId, @Path("id") String id, @Body Port port)

  @DELETE("projects/{projectId}/port/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/port/{id}?action=activate")
  Call<Port> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/port/{id}?action=deactivate")
  Call<Port> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/port/{id}?action=purge")
  Call<Port> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/port/{id}?action=remove")
  Call<Port> remove(@Path("projectId") String projectId, @Path("id") String id)
}
