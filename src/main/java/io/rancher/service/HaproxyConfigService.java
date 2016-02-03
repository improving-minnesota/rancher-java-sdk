package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.HaproxyConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface HaproxyConfigService {

  @GET("haproxyConfig")
  Call<TypeCollection<HaproxyConfig>> list();

  @GET("haproxyConfig")
  Call<TypeCollection<HaproxyConfig>> list(@QueryMap Filters filters);

  @GET("haproxyConfig/{id}")
  Call<HaproxyConfig> get(@Path("id") String id);

  @POST("haproxyConfig")
  Call<HaproxyConfig> create(@Body HaproxyConfig haproxyConfig);

  @PUT("haproxyConfig/{id}")
  Call<HaproxyConfig> update(@Path("id") String id, @Body HaproxyConfig haproxyConfig);

  @DELETE("haproxyConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
