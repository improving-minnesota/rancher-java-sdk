package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.AddRemoveServiceLinkInput
import io.rancher.type.KubernetesService
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

interface KubernetesServiceApi { 
  @GET("kubernetesService")
  Call<TypeCollection<KubernetesService>> list()

  @GET("kubernetesService")
  Call<TypeCollection<KubernetesService>> query(@QueryMap Map<String, String> filters)
  
  @GET("kubernetesService/{id}")
  Call<KubernetesService> findById(@Path("id") String id)

  @POST("kubernetesService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id)

  @POST("kubernetesService/{id}?action=addservicelink")
  Call<Service> addservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("kubernetesService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id)

  @POST("kubernetesService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id)

  @POST("kubernetesService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id)

  @POST("kubernetesService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id)

  @POST("kubernetesService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id)

  @POST("kubernetesService/{id}?action=removeservicelink")
  Call<Service> removeservicelink(@Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @POST("kubernetesService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("kubernetesService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id)

  @POST("kubernetesService/{id}?action=setservicelinks")
  Call<Service> setservicelinks(@Path("id") String id, @Body SetServiceLinksInput setServiceLinksInput)

  @POST("kubernetesService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
