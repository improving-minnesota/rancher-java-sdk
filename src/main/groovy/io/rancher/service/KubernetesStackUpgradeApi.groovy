package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.KubernetesStackUpgrade
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface KubernetesStackUpgradeApi {
  @GET("projects/{projectId}/kubernetesStackUpgrade")
  Call<TypeCollection<KubernetesStackUpgrade>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/kubernetesStackUpgrade")
  Call<TypeCollection<KubernetesStackUpgrade>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/kubernetesStackUpgrade/{id}")
  Call<KubernetesStackUpgrade> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStackUpgrade")
  Call<KubernetesStackUpgrade> create(@Path("projectId") String projectId, @Body KubernetesStackUpgrade kubernetesStackUpgrade)

  @PUT("projects/{projectId}/kubernetesStackUpgrade/{id}")
  Call<KubernetesStackUpgrade> update(@Path("projectId") String projectId, @Path("id") String id, @Body KubernetesStackUpgrade kubernetesStackUpgrade)

  @DELETE("projects/{projectId}/kubernetesStackUpgrade/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
