package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ScheduledUpgrade
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ScheduledUpgradeApi {
  @GET('scheduledUpgrades')
  Call<TypeCollection<ScheduledUpgrade>> list()

  @GET('scheduledUpgrades')
  Call<TypeCollection<ScheduledUpgrade>> query(@QueryMap Map<String, String> filters)

  @GET('scheduledUpgrades/{id}')
  Call<ScheduledUpgrade> findById(@Path('id') String id)

  @POST('scheduledUpgrades/{id}?action=start')
  Call<ScheduledUpgrade> start(@Path('id') String id)

  @POST('scheduledUpgrades/{id}?action=remove')
  Call<ScheduledUpgrade> remove(@Path('id') String id)

}
