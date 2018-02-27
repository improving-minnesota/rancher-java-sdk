package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ExternalEvent
import io.rancher.type.ExternalServiceEvent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ExternalServiceEventApi { 
  @GET("externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> list()

  @GET("externalServiceEvent")
  Call<TypeCollection<ExternalServiceEvent>> query(@QueryMap Map<String, String> filters)
  
  @GET("externalServiceEvent/{id}")
  Call<ExternalServiceEvent> findById(@Path("id") String id)

  @POST("externalServiceEvent/{id}?action=remove")
  Call<ExternalEvent> remove(@Path("id") String id)
}
