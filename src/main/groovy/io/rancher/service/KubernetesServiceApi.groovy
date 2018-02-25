package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.AddRemoveServiceLinkInput
import io.rancher.type.KubernetesService
import io.rancher.type.Service
import io.rancher.type.ServiceRestart
import io.rancher.type.ServiceUpgrade
import io.rancher.type.SetServiceLinksInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface KubernetesServiceApi {
  @GET("projects/{projectId}/kubernetesService")
  Call<TypeCollection<KubernetesService>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/kubernetesService")
  Call<TypeCollection<KubernetesService>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/kubernetesService/{id}")
  Call<KubernetesService> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService")
  Call<KubernetesService> create(@Path("projectId") String projectId, @Body KubernetesService kubernetesService)

  @PUT("projects/{projectId}/kubernetesService/{id}")
  Call<KubernetesService> update(@Path("projectId") String projectId, @Path("id") String id, @Body KubernetesService kubernetesService)

  @DELETE("projects/{projectId}/kubernetesService/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=activate")
  Call<Service> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("projects/{projectId}/kubernetesService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=remove")
  Call<Service> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("projects/{projectId}/kubernetesService/{id}?action=restart")
  Call<Service> restart(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("projects/{projectId}/kubernetesService/{id}?action=rollback")
  Call<Service> rollback(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/kubernetesService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("projectId") String projectId, @Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST("projects/{projectId}/kubernetesService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
