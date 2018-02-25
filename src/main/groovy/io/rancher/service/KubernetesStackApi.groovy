package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.KubernetesStack
import io.rancher.type.KubernetesStackUpgrade
import io.rancher.type.Stack
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface KubernetesStackApi {
  @GET("projects/{projectId}/kubernetesStack")
  Call<TypeCollection<KubernetesStack>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/kubernetesStack")
  Call<TypeCollection<KubernetesStack>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/kubernetesStack/{id}")
  Call<KubernetesStack> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStack")
  Call<KubernetesStack> create(@Path("projectId") String projectId, @Body KubernetesStack kubernetesStack)

  @PUT("projects/{projectId}/kubernetesStack/{id}")
  Call<KubernetesStack> update(@Path("projectId") String projectId, @Path("id") String id, @Body KubernetesStack kubernetesStack)

  @DELETE("projects/{projectId}/kubernetesStack/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStack/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStack/{id}?action=error")
  Call<Stack> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStack/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStack/{id}?action=remove")
  Call<Stack> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStack/{id}?action=rollback")
  Call<Stack> rollback(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesStack/{id}?action=upgrade")
  Call<KubernetesStack> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body KubernetesStackUpgrade kubernetesStackUpgrade)
}
