package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerCookieStickinessPolicy;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoadBalancerCookieStickinessPolicyService {

  @GET("loadBalancerCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerCookieStickinessPolicy>> list();

  @GET("loadBalancerCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerCookieStickinessPolicy>> list(@QueryMap Filters filters);

  @GET("loadBalancerCookieStickinessPolicy/{id}")
  Call<LoadBalancerCookieStickinessPolicy> get(@Path("id") String id);

  @POST("loadBalancerCookieStickinessPolicy")
  Call<LoadBalancerCookieStickinessPolicy> create(@Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy);

  @PUT("loadBalancerCookieStickinessPolicy/{id}")
  Call<LoadBalancerCookieStickinessPolicy> update(@Path("id") String id, @Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy);

  @DELETE("loadBalancerCookieStickinessPolicy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
