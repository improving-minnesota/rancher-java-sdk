package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.DefaultNetwork
import io.rancher.type.Network
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DefaultNetworkApi {
  @GET("projects/{projectId}/defaultNetwork")
  Call<TypeCollection<DefaultNetwork>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/defaultNetwork")
  Call<TypeCollection<DefaultNetwork>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/defaultNetwork/{id}")
  Call<DefaultNetwork> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/defaultNetwork")
  Call<DefaultNetwork> create(@Path("projectId") String projectId, @Body DefaultNetwork defaultNetwork)

  @PUT("projects/{projectId}/defaultNetwork/{id}")
  Call<DefaultNetwork> update(@Path("projectId") String projectId, @Path("id") String id, @Body DefaultNetwork defaultNetwork)

  @DELETE("projects/{projectId}/defaultNetwork/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/defaultNetwork/{id}?action=activate")
  Call<Network> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/defaultNetwork/{id}?action=deactivate")
  Call<Network> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/defaultNetwork/{id}?action=purge")
  Call<Network> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/defaultNetwork/{id}?action=remove")
  Call<Network> remove(@Path("projectId") String projectId, @Path("id") String id)
}
