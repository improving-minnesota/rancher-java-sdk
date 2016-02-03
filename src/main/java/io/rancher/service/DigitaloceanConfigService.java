package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DigitaloceanConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DigitaloceanConfigService {

  @GET("digitaloceanConfig")
  Call<TypeCollection<DigitaloceanConfig>> list();

  @GET("digitaloceanConfig")
  Call<TypeCollection<DigitaloceanConfig>> list(@QueryMap Filters filters);

  @GET("digitaloceanConfig/{id}")
  Call<DigitaloceanConfig> get(@Path("id") String id);

  @POST("digitaloceanConfig")
  Call<DigitaloceanConfig> create(@Body DigitaloceanConfig digitaloceanConfig);

  @PUT("digitaloceanConfig/{id}")
  Call<DigitaloceanConfig> update(@Path("id") String id, @Body DigitaloceanConfig digitaloceanConfig);

  @DELETE("digitaloceanConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
