package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ConfigItemStatus;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ConfigItemStatusService {

  @GET("configItemStatus")
  Call<TypeCollection<ConfigItemStatus>> list();

  @GET("configItemStatus")
  Call<TypeCollection<ConfigItemStatus>> list(@QueryMap HashMap<String,String> filters);

  @GET("configItemStatus/{id}")
  Call<ConfigItemStatus> get(@Path("id") String id);

  @POST("configItemStatus")
  Call<ConfigItemStatus> create(@Body ConfigItemStatus configItemStatus);

  @PUT("configItemStatus/{id}")
  Call<ConfigItemStatus> update(@Path("id") String id, @Body ConfigItemStatus configItemStatus);

  @DELETE("configItemStatus/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
