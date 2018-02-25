package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ServiceBinding
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ServiceBindingApi {
  @GET("projects/{projectId}/serviceBinding")
  Call<TypeCollection<ServiceBinding>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/serviceBinding")
  Call<TypeCollection<ServiceBinding>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/serviceBinding/{id}")
  Call<ServiceBinding> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/serviceBinding")
  Call<ServiceBinding> create(@Path("projectId") String projectId, @Body ServiceBinding serviceBinding)

  @PUT("projects/{projectId}/serviceBinding/{id}")
  Call<ServiceBinding> update(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceBinding serviceBinding)

  @DELETE("projects/{projectId}/serviceBinding/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
