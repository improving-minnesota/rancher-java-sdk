package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkPolicyRuleBetween;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkPolicyRuleBetweenService {

  @GET("networkPolicyRuleBetween")
  Call<TypeCollection<NetworkPolicyRuleBetween>> list();

  @GET("networkPolicyRuleBetween")
  Call<TypeCollection<NetworkPolicyRuleBetween>> list(@QueryMap HashMap<String,String> filters);

  @GET("networkPolicyRuleBetween/{id}")
  Call<NetworkPolicyRuleBetween> get(@Path("id") String id);

  @POST("networkPolicyRuleBetween")
  Call<NetworkPolicyRuleBetween> create(@Body NetworkPolicyRuleBetween networkPolicyRuleBetween);

  @PUT("networkPolicyRuleBetween/{id}")
  Call<NetworkPolicyRuleBetween> update(@Path("id") String id, @Body NetworkPolicyRuleBetween networkPolicyRuleBetween);

  @DELETE("networkPolicyRuleBetween/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
