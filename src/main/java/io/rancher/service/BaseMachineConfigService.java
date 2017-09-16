package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.BaseMachineConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BaseMachineConfigService {

  @GET("baseMachineConfig")
  Call<TypeCollection<BaseMachineConfig>> list();

  @GET("baseMachineConfig")
  Call<TypeCollection<BaseMachineConfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("baseMachineConfig/{id}")
  Call<BaseMachineConfig> get(@Path("id") String id);

  @POST("baseMachineConfig")
  Call<BaseMachineConfig> create(@Body BaseMachineConfig baseMachineConfig);

  @PUT("baseMachineConfig/{id}")
  Call<BaseMachineConfig> update(@Path("id") String id, @Body BaseMachineConfig baseMachineConfig);

  @DELETE("baseMachineConfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
