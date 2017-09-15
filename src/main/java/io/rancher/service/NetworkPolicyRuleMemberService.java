package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NetworkPolicyRuleMember;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NetworkPolicyRuleMemberService {

  @GET("networkPolicyRuleMember")
  Call<TypeCollection<NetworkPolicyRuleMember>> list();

  @GET("networkPolicyRuleMember")
  Call<TypeCollection<NetworkPolicyRuleMember>> list(@QueryMap Filters filters);

  @GET("networkPolicyRuleMember/{id}")
  Call<NetworkPolicyRuleMember> get(@Path("id") String id);

  @POST("networkPolicyRuleMember")
  Call<NetworkPolicyRuleMember> create(@Body NetworkPolicyRuleMember networkPolicyRuleMember);

  @PUT("networkPolicyRuleMember/{id}")
  Call<NetworkPolicyRuleMember> update(@Path("id") String id, @Body NetworkPolicyRuleMember networkPolicyRuleMember);

  @DELETE("networkPolicyRuleMember/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
