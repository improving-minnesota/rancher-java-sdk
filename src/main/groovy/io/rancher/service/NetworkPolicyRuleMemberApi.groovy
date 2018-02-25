package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.NetworkPolicyRuleMember
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface NetworkPolicyRuleMemberApi {
  @GET("projects/{projectId}/networkPolicyRuleMember")
  Call<TypeCollection<NetworkPolicyRuleMember>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/networkPolicyRuleMember")
  Call<TypeCollection<NetworkPolicyRuleMember>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/networkPolicyRuleMember/{id}")
  Call<NetworkPolicyRuleMember> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/networkPolicyRuleMember")
  Call<NetworkPolicyRuleMember> create(@Path("projectId") String projectId, @Body NetworkPolicyRuleMember networkPolicyRuleMember)

  @PUT("projects/{projectId}/networkPolicyRuleMember/{id}")
  Call<NetworkPolicyRuleMember> update(@Path("projectId") String projectId, @Path("id") String id, @Body NetworkPolicyRuleMember networkPolicyRuleMember)

  @DELETE("projects/{projectId}/networkPolicyRuleMember/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
