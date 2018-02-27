package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.AddRemoveServiceLinkInput
import io.rancher.type.DnsService
import io.rancher.type.Service
import io.rancher.type.ServiceRestart
import io.rancher.type.ServiceUpgrade
import io.rancher.type.SetServiceLinksInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DnsServiceApi {
  @GET("dnsService")
  Call<TypeCollection<DnsService>> list()

  @GET("dnsService")
  Call<TypeCollection<DnsService>> query(@QueryMap Map<String, String> filters)

  @GET("dnsService/{id}")
  Call<DnsService> findById(@Path("id") String id)

  @POST("dnsService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id)

  @POST("dnsService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("dnsService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id)

  @POST("dnsService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id)

  @POST("dnsService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id)

  @POST("dnsService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id)

  @POST("dnsService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id)

  @POST("dnsService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("dnsService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("dnsService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id)

  @POST("dnsService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST("dnsService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
