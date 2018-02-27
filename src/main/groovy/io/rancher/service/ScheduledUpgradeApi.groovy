package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ScheduledUpgrade
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ScheduledUpgradeApi { 
  @GET("scheduledUpgrade")
  Call<TypeCollection<ScheduledUpgrade>> list()

  @GET("scheduledUpgrade")
  Call<TypeCollection<ScheduledUpgrade>> query(@QueryMap Map<String, String> filters)
  
  @GET("scheduledUpgrade/{id}")
  Call<ScheduledUpgrade> findById(@Path("id") String id)

  @POST("scheduledUpgrade/{id}?action=remove")
  Call<ScheduledUpgrade> remove(@Path("id") String id)

  @POST("scheduledUpgrade/{id}?action=start")
  Call<ScheduledUpgrade> start(@Path("id") String id)
}
