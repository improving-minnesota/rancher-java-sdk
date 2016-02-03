package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerAppCookieStickinessPolicy;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoadBalancerAppCookieStickinessPolicyService {

  @GET("loadBalancerAppCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerAppCookieStickinessPolicy>> list();

  @GET("loadBalancerAppCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerAppCookieStickinessPolicy>> list(@QueryMap Filters filters);

  @GET("loadBalancerAppCookieStickinessPolicy/{id}")
  Call<LoadBalancerAppCookieStickinessPolicy> get(@Path("id") String id);

  @POST("loadBalancerAppCookieStickinessPolicy")
  Call<LoadBalancerAppCookieStickinessPolicy> create(@Body LoadBalancerAppCookieStickinessPolicy loadBalancerAppCookieStickinessPolicy);

  @PUT("loadBalancerAppCookieStickinessPolicy/{id}")
  Call<LoadBalancerAppCookieStickinessPolicy> update(@Path("id") String id, @Body LoadBalancerAppCookieStickinessPolicy loadBalancerAppCookieStickinessPolicy);

  @DELETE("loadBalancerAppCookieStickinessPolicy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
