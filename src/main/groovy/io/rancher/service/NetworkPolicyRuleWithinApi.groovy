package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.NetworkPolicyRuleWithin
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkPolicyRuleWithinApi {
  @GET("projects/{projectId}/networkPolicyRuleWithin")
  Call<TypeCollection<NetworkPolicyRuleWithin>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/networkPolicyRuleWithin")
  Call<TypeCollection<NetworkPolicyRuleWithin>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/networkPolicyRuleWithin/{id}")
  Call<NetworkPolicyRuleWithin> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/networkPolicyRuleWithin")
  Call<NetworkPolicyRuleWithin> create(@Path("projectId") String projectId, @Body NetworkPolicyRuleWithin networkPolicyRuleWithin)

  @PUT("projects/{projectId}/networkPolicyRuleWithin/{id}")
  Call<NetworkPolicyRuleWithin> update(@Path("projectId") String projectId, @Path("id") String id, @Body NetworkPolicyRuleWithin networkPolicyRuleWithin)

  @DELETE("projects/{projectId}/networkPolicyRuleWithin/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
