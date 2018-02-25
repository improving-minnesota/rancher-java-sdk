package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.ExternalService
import io.rancher.type.Service
import io.rancher.type.ServiceRestart
import io.rancher.type.ServiceUpgrade
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalServiceApi {
  @GET("projects/{projectId}/externalService")
  Call<TypeCollection<ExternalService>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/externalService")
  Call<TypeCollection<ExternalService>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/externalService/{id}")
  Call<ExternalService> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService")
  Call<ExternalService> create(@Path("projectId") String projectId, @Body ExternalService externalService)

  @PUT("projects/{projectId}/externalService/{id}")
  Call<ExternalService> update(@Path("projectId") String projectId, @Path("id") String id, @Body ExternalService externalService)

  @DELETE("projects/{projectId}/externalService/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=activate")
  Call<Service> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=remove")
  Call<Service> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=restart")
  Call<Service> restart(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("projects/{projectId}/externalService/{id}?action=rollback")
  Call<Service> rollback(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/externalService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
