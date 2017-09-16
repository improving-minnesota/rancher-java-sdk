package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkPolicyRuleWithin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkPolicyRuleWithinService {

  @GET("networkPolicyRuleWithin")
  Call<TypeCollection<NetworkPolicyRuleWithin>> list();

  @GET("networkPolicyRuleWithin")
  Call<TypeCollection<NetworkPolicyRuleWithin>> list(@QueryMap HashMap<String,String> filters);

  @GET("networkPolicyRuleWithin/{id}")
  Call<NetworkPolicyRuleWithin> get(@Path("id") String id);

  @POST("networkPolicyRuleWithin")
  Call<NetworkPolicyRuleWithin> create(@Body NetworkPolicyRuleWithin networkPolicyRuleWithin);

  @PUT("networkPolicyRuleWithin/{id}")
  Call<NetworkPolicyRuleWithin> update(@Path("id") String id, @Body NetworkPolicyRuleWithin networkPolicyRuleWithin);

  @DELETE("networkPolicyRuleWithin/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
