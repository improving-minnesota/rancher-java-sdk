package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ConfigItem;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ConfigItemService {

  @GET("configItem")
  Call<TypeCollection<ConfigItem>> list();

  @GET("configItem")
  Call<TypeCollection<ConfigItem>> list(@QueryMap HashMap<String,String> filters);

  @GET("configItem/{id}")
  Call<ConfigItem> get(@Path("id") String id);

  @POST("configItem")
  Call<ConfigItem> create(@Body ConfigItem configItem);

  @PUT("configItem/{id}")
  Call<ConfigItem> update(@Path("id") String id, @Body ConfigItem configItem);

  @DELETE("configItem/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
