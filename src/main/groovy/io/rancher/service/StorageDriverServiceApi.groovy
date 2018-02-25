package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.AddRemoveServiceLinkInput
import io.rancher.type.Service
import io.rancher.type.ServiceRestart
import io.rancher.type.ServiceUpgrade
import io.rancher.type.SetServiceLinksInput
import io.rancher.type.StorageDriverService
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface StorageDriverServiceApi {
  @GET("projects/{projectId}/storageDriverService")
  Call<TypeCollection<StorageDriverService>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/storageDriverService")
  Call<TypeCollection<StorageDriverService>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/storageDriverService/{id}")
  Call<StorageDriverService> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService")
  Call<StorageDriverService> create(@Path("projectId") String projectId, @Body StorageDriverService storageDriverService)

  @PUT("projects/{projectId}/storageDriverService/{id}")
  Call<StorageDriverService> update(@Path("projectId") String projectId, @Path("id") String id, @Body StorageDriverService storageDriverService)

  @DELETE("projects/{projectId}/storageDriverService/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=activate")
  Call<Service> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("projects/{projectId}/storageDriverService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=remove")
  Call<Service> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("projects/{projectId}/storageDriverService/{id}?action=restart")
  Call<Service> restart(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("projects/{projectId}/storageDriverService/{id}?action=rollback")
  Call<Service> rollback(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/storageDriverService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("projectId") String projectId, @Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST("projects/{projectId}/storageDriverService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
