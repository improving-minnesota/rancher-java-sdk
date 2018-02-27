package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.NetworkPolicyRuleWithin
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkPolicyRuleWithinApi {
  @GET("networkPolicyRuleWithin")
  Call<TypeCollection<NetworkPolicyRuleWithin>> list()

  @GET("networkPolicyRuleWithin")
  Call<TypeCollection<NetworkPolicyRuleWithin>> query(@QueryMap Map<String, String> filters)

  @POST("networkPolicyRuleWithin")
  Call<NetworkPolicyRuleWithin> create(@Body NetworkPolicyRuleWithin networkPolicyRuleWithin)

  @GET("networkPolicyRuleWithin/{id}")
  Call<NetworkPolicyRuleWithin> findById(@Path("id") String id)
}
