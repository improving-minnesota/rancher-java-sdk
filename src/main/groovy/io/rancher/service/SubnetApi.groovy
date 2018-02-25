package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Subnet
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface SubnetApi {
  @GET("projects/{projectId}/subnet")
  Call<TypeCollection<Subnet>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/subnet")
  Call<TypeCollection<Subnet>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/subnet/{id}")
  Call<Subnet> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/subnet")
  Call<Subnet> create(@Path("projectId") String projectId, @Body Subnet subnet)

  @PUT("projects/{projectId}/subnet/{id}")
  Call<Subnet> update(@Path("projectId") String projectId, @Path("id") String id, @Body Subnet subnet)

  @DELETE("projects/{projectId}/subnet/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/subnet/{id}?action=activate")
  Call<Subnet> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/subnet/{id}?action=deactivate")
  Call<Subnet> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/subnet/{id}?action=purge")
  Call<Subnet> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/subnet/{id}?action=remove")
  Call<Subnet> remove(@Path("projectId") String projectId, @Path("id") String id)
}
