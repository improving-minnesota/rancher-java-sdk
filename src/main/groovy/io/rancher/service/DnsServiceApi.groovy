package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.AddRemoveServiceLinkInput
import io.rancher.type.DnsService
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

interface DnsServiceApi {
  @GET("projects/{projectId}/dnsService")
  Call<TypeCollection<DnsService>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/dnsService")
  Call<TypeCollection<DnsService>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/dnsService/{id}")
  Call<DnsService> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService")
  Call<DnsService> create(@Path("projectId") String projectId, @Body DnsService dnsService)

  @PUT("projects/{projectId}/dnsService/{id}")
  Call<DnsService> update(@Path("projectId") String projectId, @Path("id") String id, @Body DnsService dnsService)

  @DELETE("projects/{projectId}/dnsService/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=activate")
  Call<Service> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("projects/{projectId}/dnsService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=remove")
  Call<Service> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("projects/{projectId}/dnsService/{id}?action=restart")
  Call<Service> restart(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("projects/{projectId}/dnsService/{id}?action=rollback")
  Call<Service> rollback(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/dnsService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("projectId") String projectId, @Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST("projects/{projectId}/dnsService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
