package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoadBalancerConfigService {

  @GET("loadBalancerConfig")
  Call<TypeCollection<LoadBalancerConfig>> list();

  @GET("loadBalancerConfig")
  Call<TypeCollection<LoadBalancerConfig>> list(@QueryMap Filters filters);

  @GET("loadBalancerConfig/{id}")
  Call<LoadBalancerConfig> get(@Path("id") String id);

  @POST("loadBalancerConfig")
  Call<LoadBalancerConfig> create(@Body LoadBalancerConfig loadBalancerConfig);

  @PUT("loadBalancerConfig/{id}")
  Call<LoadBalancerConfig> update(@Path("id") String id, @Body LoadBalancerConfig loadBalancerConfig);

  @DELETE("loadBalancerConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
