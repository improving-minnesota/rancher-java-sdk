package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalService
import io.rancher.type.Service
import io.rancher.type.ServiceRestart
import io.rancher.type.ServiceUpgrade
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalServiceApi {
  @GET("externalService")
  Call<TypeCollection<ExternalService>> list()

  @GET("externalService")
  Call<TypeCollection<ExternalService>> query(@QueryMap Map<String, String> filters)
  
  @GET("externalService/{id}")
  Call<ExternalService> findById(@Path("id") String id)

  @POST("externalService/{id}?action=activate")
  Call<Service> activate(@Path("id") String id)

  @POST("externalService/{id}?action=cancelupgrade")
  Call<Service> cancelupgrade(@Path("id") String id)

  @POST("externalService/{id}?action=continueupgrade")
  Call<Service> continueupgrade(@Path("id") String id)

  @POST("externalService/{id}?action=deactivate")
  Call<Service> deactivate(@Path("id") String id)

  @POST("externalService/{id}?action=finishupgrade")
  Call<Service> finishupgrade(@Path("id") String id)

  @POST("externalService/{id}?action=remove")
  Call<Service> remove(@Path("id") String id)

  @POST("externalService/{id}?action=restart")
  Call<Service> restart(@Path("id") String id, @Body ServiceRestart serviceRestart)

  @POST("externalService/{id}?action=rollback")
  Call<Service> rollback(@Path("id") String id)

  @POST("externalService/{id}?action=upgrade")
  Call<Service> upgrade(@Path("id") String id, @Body ServiceUpgrade serviceUpgrade)
}
