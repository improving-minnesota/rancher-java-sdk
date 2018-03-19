package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.NetworkPolicyRuleWithin
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkPolicyRuleWithinApi {
  @GET('networkPolicyRuleWithins')
  Call<TypeCollection<NetworkPolicyRuleWithin>> list()

  @GET('networkPolicyRuleWithins')
  Call<TypeCollection<NetworkPolicyRuleWithin>> query(@QueryMap Map<String, String> filters)

  @POST('networkPolicyRuleWithins')
  Call<NetworkPolicyRuleWithin> create(@Body NetworkPolicyRuleWithin networkPolicyRuleWithin)

  @GET('networkPolicyRuleWithins/{id}')
  Call<NetworkPolicyRuleWithin> findById(@Path('id') String id)

}
