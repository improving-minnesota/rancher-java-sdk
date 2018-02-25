package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Host
import io.rancher.type.HostAccess
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface HostApi {
  @GET("projects/{projectId}/host")
  Call<TypeCollection<Host>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/host")
  Call<TypeCollection<Host>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/host/{id}")
  Call<Host> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host")
  Call<Host> create(@Path("projectId") String projectId, @Body Host host)

  @PUT("projects/{projectId}/host/{id}")
  Call<Host> update(@Path("projectId") String projectId, @Path("id") String id, @Body Host host)

  @DELETE("projects/{projectId}/host/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=activate")
  Call<Host> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=deactivate")
  Call<Host> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=dockersocket")
  Call<HostAccess> dockersocket(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=error")
  Call<Host> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=evacuate")
  Call<Host> evacuate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=provision")
  Call<Host> provision(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=purge")
  Call<Host> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/host/{id}?action=remove")
  Call<Host> remove(@Path("projectId") String projectId, @Path("id") String id)
}
