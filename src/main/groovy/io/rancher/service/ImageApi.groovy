package io.rancher.service

import io.rancher.base.Filters
import io.rancher.base.TypeCollection
import io.rancher.type.Image
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ImageApi {
  @GET("projects/{projectId}/image")
  Call<TypeCollection<Image>> list(@Path("projectId") String projectId)

  @GET("projects/{projectId}/image")
  Call<TypeCollection<Image>> query(@Path("projectId") String projectId, @QueryMap Filters<String, String> filters)

  @GET("projects/{projectId}/image/{id}")
  Call<Image> get(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/image")
  Call<Image> create(@Path("projectId") String projectId, @Body Image image)

  @PUT("projects/{projectId}/image/{id}")
  Call<Image> update(@Path("projectId") String projectId, @Path("id") String id, @Body Image image)

  @DELETE("projects/{projectId}/image/{id}")
  Call<Response> delete(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/image/{id}?action=activate")
  Call<Image> activate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/image/{id}?action=deactivate")
  Call<Image> deactivate(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/image/{id}?action=purge")
  Call<Image> purge(@Path("projectId") String projectId, @Path("id") String id)

  @POST("projects/{projectId}/image/{id}?action=remove")
  Call<Image> remove(@Path("projectId") String projectId, @Path("id") String id)
}
