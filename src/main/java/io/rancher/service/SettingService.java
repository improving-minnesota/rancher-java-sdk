package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Setting;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SettingService {

  @GET("setting")
  Call<TypeCollection<Setting>> list();

  @GET("setting")
  Call<TypeCollection<Setting>> list(@QueryMap Filters filters);

  @GET("setting/{id}")
  Call<Setting> get(@Path("id") String id);

  @POST("setting")
  Call<Setting> create(@Body Setting setting);

  @PUT("setting/{id}")
  Call<Setting> update(@Path("id") String id, @Body Setting setting);

  @DELETE("setting/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
