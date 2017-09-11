package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkPolicyRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkPolicyRuleService {

  @GET("networkPolicyRule")
  Call<TypeCollection<NetworkPolicyRule>> list();

  @GET("networkPolicyRule")
  Call<TypeCollection<NetworkPolicyRule>> list(@QueryMap Filters filters);

  @GET("networkPolicyRule/{id}")
  Call<NetworkPolicyRule> get(@Path("id") String id);

  @POST("networkPolicyRule")
  Call<NetworkPolicyRule> create(@Body NetworkPolicyRule networkPolicyRule);

  @PUT("networkPolicyRule/{id}")
  Call<NetworkPolicyRule> update(@Path("id") String id, @Body NetworkPolicyRule networkPolicyRule);

  @DELETE("networkPolicyRule/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
