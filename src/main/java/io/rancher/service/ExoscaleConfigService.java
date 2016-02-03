package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExoscaleConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ExoscaleConfigService {

  @GET("exoscaleConfig")
  Call<TypeCollection<ExoscaleConfig>> list();

  @GET("exoscaleConfig")
  Call<TypeCollection<ExoscaleConfig>> list(@QueryMap Filters filters);

  @GET("exoscaleConfig/{id}")
  Call<ExoscaleConfig> get(@Path("id") String id);

  @POST("exoscaleConfig")
  Call<ExoscaleConfig> create(@Body ExoscaleConfig exoscaleConfig);

  @PUT("exoscaleConfig/{id}")
  Call<ExoscaleConfig> update(@Path("id") String id, @Body ExoscaleConfig exoscaleConfig);

  @DELETE("exoscaleConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
