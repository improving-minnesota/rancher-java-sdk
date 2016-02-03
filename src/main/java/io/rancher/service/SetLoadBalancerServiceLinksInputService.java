package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetLoadBalancerServiceLinksInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SetLoadBalancerServiceLinksInputService {

  @GET("setLoadBalancerServiceLinksInput")
  Call<TypeCollection<SetLoadBalancerServiceLinksInput>> list();

  @GET("setLoadBalancerServiceLinksInput")
  Call<TypeCollection<SetLoadBalancerServiceLinksInput>> list(@QueryMap Filters filters);

  @GET("setLoadBalancerServiceLinksInput/{id}")
  Call<SetLoadBalancerServiceLinksInput> get(@Path("id") String id);

  @POST("setLoadBalancerServiceLinksInput")
  Call<SetLoadBalancerServiceLinksInput> create(@Body SetLoadBalancerServiceLinksInput setLoadBalancerServiceLinksInput);

  @PUT("setLoadBalancerServiceLinksInput/{id}")
  Call<SetLoadBalancerServiceLinksInput> update(@Path("id") String id, @Body SetLoadBalancerServiceLinksInput setLoadBalancerServiceLinksInput);

  @DELETE("setLoadBalancerServiceLinksInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
