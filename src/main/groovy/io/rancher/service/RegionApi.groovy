package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Region
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RegionApi {
  @GET("projects/{projectId}/region")
  Call<TypeCollection<Region>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/region")
  Call<TypeCollection<Region>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/region/{id}")
  Call<Region> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/region")
  Call<Region> create(@Path("projectId") String projectId, @Body Region region)

  @PUT("projects/{projectId}/region/{id}")
  Call<Region> update(@Path("projectId") String projectId, @Path("id") String id, @Body Region region)

  @DELETE("projects/{projectId}/region/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/region/{id}?action=activate")
  Call<Region> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/region/{id}?action=deactivate")
  Call<Region> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/region/{id}?action=purge")
  Call<Region> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/region/{id}?action=remove")
  Call<Region> remove(@Path("projectId") String projectId, @Path("id") String id)
}
