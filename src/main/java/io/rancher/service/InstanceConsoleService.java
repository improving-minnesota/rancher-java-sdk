package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceConsole;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface InstanceConsoleService {

  @GET("instanceConsole")
  Call<TypeCollection<InstanceConsole>> list();

  @GET("instanceConsole")
  Call<TypeCollection<InstanceConsole>> list(@QueryMap HashMap<String,String> filters);

  @GET("instanceConsole/{id}")
  Call<InstanceConsole> get(@Path("id") String id);

  @POST("instanceConsole")
  Call<InstanceConsole> create(@Body InstanceConsole instanceConsole);

  @PUT("instanceConsole/{id}")
  Call<InstanceConsole> update(@Path("id") String id, @Body InstanceConsole instanceConsole);

  @DELETE("instanceConsole/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
