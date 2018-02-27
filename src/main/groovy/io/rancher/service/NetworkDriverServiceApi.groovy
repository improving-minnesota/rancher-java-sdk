package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.AddRemoveServiceLinkInput
import io.rancher.type.NetworkDriverService
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

interface NetworkDriverServiceApi { 
  @GET("networkDriverService")
  Call<TypeCollection<NetworkDriverService>> list()

  @GET("networkDriverService")
  Call<TypeCollection<NetworkDriverService>> query(@QueryMap Map<String, String> filters)

  @GET("networkDriverService/{id}")
  Call<NetworkDriverService> findById(@Path("id") String id)

  @POST("networkDriverService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id)

  @POST("networkDriverService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("networkDriverService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id)

  @POST("networkDriverService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id)

  @POST("networkDriverService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id)

  @POST("networkDriverService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id)

  @POST("networkDriverService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id)

  @POST("networkDriverService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("networkDriverService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("networkDriverService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id)

  @POST("networkDriverService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST("networkDriverService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
