package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ActiveSetting;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ActiveSettingService {

  @GET("activeSetting")
  Call<TypeCollection<ActiveSetting>> list();

  @GET("activeSetting")
  Call<TypeCollection<ActiveSetting>> list(@QueryMap Filters filters);

  @GET("activeSetting/{id}")
  Call<ActiveSetting> get(@Path("id") String id);

  @POST("activeSetting")
  Call<ActiveSetting> create(@Body ActiveSetting activeSetting);

  @PUT("activeSetting/{id}")
  Call<ActiveSetting> update(@Path("id") String id, @Body ActiveSetting activeSetting);

  @DELETE("activeSetting/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
