package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.MountEntry
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface MountEntryApi {
  @GET("projects/{projectId}/mountEntry")
  Call<TypeCollection<MountEntry>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/mountEntry")
  Call<TypeCollection<MountEntry>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/mountEntry/{id}")
  Call<MountEntry> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/mountEntry")
  Call<MountEntry> create(@Path("projectId") String projectId, @Body MountEntry mountEntry)

  @PUT("projects/{projectId}/mountEntry/{id}")
  Call<MountEntry> update(@Path("projectId") String projectId, @Path("id") String id, @Body MountEntry mountEntry)

  @DELETE("projects/{projectId}/mountEntry/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
