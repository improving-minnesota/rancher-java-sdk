package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ComposeProject
import io.rancher.type.Stack
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ComposeProjectApi {
  @GET("composeProject")
  Call<TypeCollection<ComposeProject>> list()

  @GET("composeProject")
  Call<TypeCollection<ComposeProject>> query(@QueryMap Map<String, String> filters)

  @GET("composeProject/{id}")
  Call<ComposeProject> findById(@Path("id") String id)

  @POST("composeProject/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("id") String id)

  @POST("composeProject/{id}?action=error")
  Call<Stack> error(@Path("id") String id)

  @POST("composeProject/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("id") String id)

  @POST("composeProject/{id}?action=remove")
  Call<Stack> remove(@Path("id") String id)

  @POST("composeProject/{id}?action=rollback")
  Call<Stack> rollback(@Path("id") String id)
}
