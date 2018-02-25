package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.NetworkPolicyRule
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkPolicyRuleApi {
  @GET("projects/{projectId}/networkPolicyRule")
  Call<TypeCollection<NetworkPolicyRule>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/networkPolicyRule")
  Call<TypeCollection<NetworkPolicyRule>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/networkPolicyRule/{id}")
  Call<NetworkPolicyRule> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/networkPolicyRule")
  Call<NetworkPolicyRule> create(@Path("projectId") String projectId, @Body NetworkPolicyRule networkPolicyRule)

  @PUT("projects/{projectId}/networkPolicyRule/{id}")
  Call<NetworkPolicyRule> update(@Path("projectId") String projectId, @Path("id") String id, @Body NetworkPolicyRule networkPolicyRule)

  @DELETE("projects/{projectId}/networkPolicyRule/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
