package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LogConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LogConfigService {

  @GET("logConfig")
  Call<TypeCollection<LogConfig>> list();

  @GET("logConfig")
  Call<TypeCollection<LogConfig>> list(@QueryMap Filters filters);

  @GET("logConfig/{id}")
  Call<LogConfig> get(@Path("id") String id);

  @POST("logConfig")
  Call<LogConfig> create(@Body LogConfig logConfig);

  @PUT("logConfig/{id}")
  Call<LogConfig> update(@Path("id") String id, @Body LogConfig logConfig);

  @DELETE("logConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
