package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceConsumeMap
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceConsumeMapApi {
  @GET("projects/{projectId}/serviceConsumeMap")
  Call<TypeCollection<ServiceConsumeMap>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceConsumeMap")
  Call<TypeCollection<ServiceConsumeMap>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceConsumeMap/{id}")
  Call<ServiceConsumeMap> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceConsumeMap")
  Call<ServiceConsumeMap> create(@Path("projectId") String projectId, @Body ServiceConsumeMap serviceConsumeMap)

  @PUT("projects/{projectId}/serviceConsumeMap/{id}")
  Call<ServiceConsumeMap> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceConsumeMap serviceConsumeMap)

  @DELETE("projects/{projectId}/serviceConsumeMap/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceConsumeMap/{id}?action=remove")
  Call<ServiceConsumeMap> remove(@Path("projectId") String projectId, @Path("id") String id)
}
