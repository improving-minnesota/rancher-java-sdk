package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ScheduledUpgrade;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ScheduledUpgradeService {

  @GET("scheduledUpgrade")
  Call<TypeCollection<ScheduledUpgrade>> list();

  @GET("scheduledUpgrade")
  Call<TypeCollection<ScheduledUpgrade>> list(@QueryMap Filters filters);

  @GET("scheduledUpgrade/{id}")
  Call<ScheduledUpgrade> get(@Path("id") String id);

  @POST("scheduledUpgrade")
  Call<ScheduledUpgrade> create(@Body ScheduledUpgrade scheduledUpgrade);

  @PUT("scheduledUpgrade/{id}")
  Call<ScheduledUpgrade> update(@Path("id") String id, @Body ScheduledUpgrade scheduledUpgrade);

  @DELETE("scheduledUpgrade/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("scheduledUpgrade/{id}?action=remove")
  Call<ScheduledUpgrade> remove(@Path("id") String id);
  
  @POST("scheduledUpgrade/{id}?action=start")
  Call<ScheduledUpgrade> start(@Path("id") String id);
  
}
