package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Setting;

import retrofit2.Call;
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
  Call<TypeCollection<Setting>> list(@QueryMap HashMap<String,String> filters);

  @GET("setting/{id}")
  Call<Setting> get(@Path("id") String id);

  @POST("setting")
  Call<Setting> create(@Body Setting setting);

  @PUT("setting/{id}")
  Call<Setting> update(@Path("id") String id, @Body Setting setting);

  @DELETE("setting/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
