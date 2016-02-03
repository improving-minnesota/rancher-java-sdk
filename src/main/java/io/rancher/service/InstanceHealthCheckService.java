package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceHealthCheck;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface InstanceHealthCheckService {

  @GET("instanceHealthCheck")
  Call<TypeCollection<InstanceHealthCheck>> list();

  @GET("instanceHealthCheck")
  Call<TypeCollection<InstanceHealthCheck>> list(@QueryMap Filters filters);

  @GET("instanceHealthCheck/{id}")
  Call<InstanceHealthCheck> get(@Path("id") String id);

  @POST("instanceHealthCheck")
  Call<InstanceHealthCheck> create(@Body InstanceHealthCheck instanceHealthCheck);

  @PUT("instanceHealthCheck/{id}")
  Call<InstanceHealthCheck> update(@Path("id") String id, @Body InstanceHealthCheck instanceHealthCheck);

  @DELETE("instanceHealthCheck/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
