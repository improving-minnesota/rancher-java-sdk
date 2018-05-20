package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.ProjectMember
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProjectMemberApi {
  @GET('projectMembers')
  Call<TypeCollection<ProjectMember>> list()

  @GET('projectMembers')
  Call<TypeCollection<ProjectMember>> query(@QueryMap Map<String, String> filters)

  @POST('projectMembers')
  Call<ProjectMember> create(@Body ProjectMember projectMember)

  @GET('projectMembers/{id}')
  Call<ProjectMember> findById(@Path('id') String id)

  @POST('projectMembers/{id}?action=activate')
  Call<ProjectMember> activate(@Path('id') String id)

  @POST('projectMembers/{id}?action=purge')
  Call<ProjectMember> purge(@Path('id') String id)

  @POST('projectMembers/{id}?action=remove')
  Call<ProjectMember> remove(@Path('id') String id)

  @POST('projectMembers/{id}?action=deactivate')
  Call<ProjectMember> deactivate(@Path('id') String id)

}
