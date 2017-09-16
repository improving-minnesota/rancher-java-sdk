package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceConsoleInput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface InstanceConsoleInputService {

  @GET("instanceConsoleInput")
  Call<TypeCollection<InstanceConsoleInput>> list();

  @GET("instanceConsoleInput")
  Call<TypeCollection<InstanceConsoleInput>> list(@QueryMap HashMap<String,String> filters);

  @GET("instanceConsoleInput/{id}")
  Call<InstanceConsoleInput> get(@Path("id") String id);

  @POST("instanceConsoleInput")
  Call<InstanceConsoleInput> create(@Body InstanceConsoleInput instanceConsoleInput);

  @PUT("instanceConsoleInput/{id}")
  Call<InstanceConsoleInput> update(@Path("id") String id, @Body InstanceConsoleInput instanceConsoleInput);

  @DELETE("instanceConsoleInput/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
