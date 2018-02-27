package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProjectMember
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProjectMemberApi {
  @GET("projectMember")
  Call<TypeCollection<ProjectMember>> list()

  @GET("projectMember")
  Call<TypeCollection<ProjectMember>> query(@QueryMap Map<String, String> filters)

  @POST("projectMember")
  Call<ProjectMember> create(@Body ProjectMember projectMember)

  @GET("projectMember/{id}")
  Call<ProjectMember> findById(@Path("id") String id)

  @POST("projectMember/{id}?action=activate")
  Call<ProjectMember> activate(@Path("id") String id)

  @POST("projectMember/{id}?action=deactivate")
  Call<ProjectMember> deactivate(@Path("id") String id)

  @POST("projectMember/{id}?action=purge")
  Call<ProjectMember> purge(@Path("id") String id)

  @POST("projectMember/{id}?action=remove")
  Call<ProjectMember> remove(@Path("id") String id)
}
