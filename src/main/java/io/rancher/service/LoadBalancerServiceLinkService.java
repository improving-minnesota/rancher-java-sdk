package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerServiceLink;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoadBalancerServiceLinkService {

  @GET("loadBalancerServiceLink")
  Call<TypeCollection<LoadBalancerServiceLink>> list();

  @GET("loadBalancerServiceLink")
  Call<TypeCollection<LoadBalancerServiceLink>> list(@QueryMap Filters filters);

  @GET("loadBalancerServiceLink/{id}")
  Call<LoadBalancerServiceLink> get(@Path("id") String id);

  @POST("loadBalancerServiceLink")
  Call<LoadBalancerServiceLink> create(@Body LoadBalancerServiceLink loadBalancerServiceLink);

  @PUT("loadBalancerServiceLink/{id}")
  Call<LoadBalancerServiceLink> update(@Path("id") String id, @Body LoadBalancerServiceLink loadBalancerServiceLink);

  @DELETE("loadBalancerServiceLink/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
