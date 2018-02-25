package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServicesPortRange
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServicesPortRangeApi {
  @GET("projects/{projectId}/servicesPortRange")
  Call<TypeCollection<ServicesPortRange>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/servicesPortRange")
  Call<TypeCollection<ServicesPortRange>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/servicesPortRange/{id}")
  Call<ServicesPortRange> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/servicesPortRange")
  Call<ServicesPortRange> create(@Path("projectId") String projectId, @Body ServicesPortRange servicesPortRange)

  @PUT("projects/{projectId}/servicesPortRange/{id}")
  Call<ServicesPortRange> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServicesPortRange servicesPortRange)

  @DELETE("projects/{projectId}/servicesPortRange/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
