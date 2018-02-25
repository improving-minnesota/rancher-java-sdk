package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceExposeMap
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceExposeMapApi {
  @GET("projects/{projectId}/serviceExposeMap")
  Call<TypeCollection<ServiceExposeMap>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceExposeMap")
  Call<TypeCollection<ServiceExposeMap>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceExposeMap/{id}")
  Call<ServiceExposeMap> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceExposeMap")
  Call<ServiceExposeMap> create(@Path("projectId") String projectId, @Body ServiceExposeMap serviceExposeMap)

  @PUT("projects/{projectId}/serviceExposeMap/{id}")
  Call<ServiceExposeMap> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceExposeMap serviceExposeMap)

  @DELETE("projects/{projectId}/serviceExposeMap/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceExposeMap/{id}?action=remove")
  Call<ServiceExposeMap> remove(@Path("projectId") String projectId, @Path("id") String id)
}
