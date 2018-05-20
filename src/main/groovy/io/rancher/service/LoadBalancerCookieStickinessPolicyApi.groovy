package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.LoadBalancerCookieStickinessPolicy
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface LoadBalancerCookieStickinessPolicyApi {

  @GET('loadBalancerCookieStickinessPolicys/{id}')
  Call<LoadBalancerCookieStickinessPolicy> findById(@Path('id') String id)

}
