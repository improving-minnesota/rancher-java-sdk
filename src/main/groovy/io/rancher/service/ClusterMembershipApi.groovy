package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ClusterMembership
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ClusterMembershipApi {
  @GET("clusterMembership")
  Call<TypeCollection<ClusterMembership>> list()

  @GET("clusterMembership")
  Call<TypeCollection<ClusterMembership>> query(@QueryMap Map<String, String> filters)
  
  @GET("clusterMembership/{id}")
  Call<ClusterMembership> findById(@Path("id") String id)
}
