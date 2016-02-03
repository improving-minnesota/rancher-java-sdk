package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AddRemoveLoadBalancerServiceLinkInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AddRemoveLoadBalancerServiceLinkInputService {

  @GET("addRemoveLoadBalancerServiceLinkInput")
  Call<TypeCollection<AddRemoveLoadBalancerServiceLinkInput>> list();

  @GET("addRemoveLoadBalancerServiceLinkInput")
  Call<TypeCollection<AddRemoveLoadBalancerServiceLinkInput>> list(@QueryMap Filters filters);

  @GET("addRemoveLoadBalancerServiceLinkInput/{id}")
  Call<AddRemoveLoadBalancerServiceLinkInput> get(@Path("id") String id);

  @POST("addRemoveLoadBalancerServiceLinkInput")
  Call<AddRemoveLoadBalancerServiceLinkInput> create(@Body AddRemoveLoadBalancerServiceLinkInput addRemoveLoadBalancerServiceLinkInput);

  @PUT("addRemoveLoadBalancerServiceLinkInput/{id}")
  Call<AddRemoveLoadBalancerServiceLinkInput> update(@Path("id") String id, @Body AddRemoveLoadBalancerServiceLinkInput addRemoveLoadBalancerServiceLinkInput);

  @DELETE("addRemoveLoadBalancerServiceLinkInput/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
