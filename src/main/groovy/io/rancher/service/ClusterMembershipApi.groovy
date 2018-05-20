package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ClusterMembership
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ClusterMembershipApi {
  @GET('clusterMemberships')
  Call<TypeCollection<ClusterMembership>> list()

  @GET('clusterMemberships')
  Call<TypeCollection<ClusterMembership>> query(@QueryMap Map<String, String> filters)

  @GET('clusterMemberships/{id}')
  Call<ClusterMembership> findById(@Path('id') String id)

}
