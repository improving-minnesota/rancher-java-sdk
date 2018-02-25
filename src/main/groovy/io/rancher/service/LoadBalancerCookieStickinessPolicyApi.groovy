package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.LoadBalancerCookieStickinessPolicy
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LoadBalancerCookieStickinessPolicyApi {
  @GET("projects/{projectId}/loadBalancerCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerCookieStickinessPolicy>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/loadBalancerCookieStickinessPolicy")
  Call<TypeCollection<LoadBalancerCookieStickinessPolicy>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/loadBalancerCookieStickinessPolicy/{id}")
  Call<LoadBalancerCookieStickinessPolicy> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/loadBalancerCookieStickinessPolicy")
  Call<LoadBalancerCookieStickinessPolicy> create(@Path("projectId") String projectId, @Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy)

  @PUT("projects/{projectId}/loadBalancerCookieStickinessPolicy/{id}")
  Call<LoadBalancerCookieStickinessPolicy> update(@Path("projectId") String projectId, @Path("id") String id, @Body LoadBalancerCookieStickinessPolicy loadBalancerCookieStickinessPolicy)

  @DELETE("projects/{projectId}/loadBalancerCookieStickinessPolicy/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
