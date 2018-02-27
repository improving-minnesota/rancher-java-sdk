package io.rancher.service

import io.rancher.type.NetworkPolicyRuleMember
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface NetworkPolicyRuleMemberApi { 

  @POST("networkPolicyRuleMember")
  Call<NetworkPolicyRuleMember> create(@Body NetworkPolicyRuleMember networkPolicyRuleMember)
  
  @GET("networkPolicyRuleMember/{id}")
  Call<NetworkPolicyRuleMember> findById(@Path("id") String id)
}
