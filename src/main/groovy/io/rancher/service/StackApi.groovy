package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.AddOutputsInput
import io.rancher.type.ComposeConfig
import io.rancher.type.ComposeConfigInput
import io.rancher.type.Stack
import io.rancher.type.StackUpgrade
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface StackApi {
  @GET("projects/{projectId}/stack")
  Call<TypeCollection<Stack>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/stack")
  Call<TypeCollection<Stack>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/stack/{id}")
  Call<Stack> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack")
  Call<Stack> create(@Path("projectId") String projectId, @Body Stack stack)

  @PUT("projects/{projectId}/stack/{id}")
  Call<Stack> update(@Path("projectId") String projectId, @Path("id") String id, @Body Stack stack)

  @DELETE("projects/{projectId}/stack/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=activateservices")
  Call<Stack> activateservices(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=addoutputs")
  Call<Stack> addoutputs(@Path("projectId") String projectId, @Path("id") String id, @Body AddOutputsInput addOutputsInput)

  @POST("projects/{projectId}/stack/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=deactivateservices")
  Call<Stack> deactivateservices(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=error")
  Call<Stack> error(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=exportconfig")
  Call<ComposeConfig> exportconfig(@Path("projectId") String projectId, @Path("id") String id, @Body ComposeConfigInput composeConfigInput)

  @POST("projects/{projectId}/stack/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=remove")
  Call<Stack> remove(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=rollback")
  Call<Stack> rollback(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/stack/{id}?action=upgrade")
  Call<Stack> upgrade(@Path("projectId") String projectId, @Path("id") String id, @Body StackUpgrade stackUpgrade)
}
