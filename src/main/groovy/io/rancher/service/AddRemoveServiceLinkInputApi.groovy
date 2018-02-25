package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.AddRemoveServiceLinkInput
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AddRemoveServiceLinkInputApi {
  @GET("projects/{projectId}/addRemoveServiceLinkInput")
  Call<TypeCollection<AddRemoveServiceLinkInput>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/addRemoveServiceLinkInput")
  Call<TypeCollection<AddRemoveServiceLinkInput>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/addRemoveServiceLinkInput/{id}")
  Call<AddRemoveServiceLinkInput> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/addRemoveServiceLinkInput")
  Call<AddRemoveServiceLinkInput> create(@Path("projectId") String projectId, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @PUT("projects/{projectId}/addRemoveServiceLinkInput/{id}")
  Call<AddRemoveServiceLinkInput> update(@Path("projectId") String projectId, @Path("id") String id, @Body AddRemoveServiceLinkInput addRemoveServiceLinkInput)

  @DELETE("projects/{projectId}/addRemoveServiceLinkInput/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)
}
