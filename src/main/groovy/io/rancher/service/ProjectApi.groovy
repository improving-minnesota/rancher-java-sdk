package io.rancher.service

import io.rancher.base.TypeCollection
import io.rancher.type.Account
import io.rancher.type.Project
import io.rancher.type.SetProjectMembersInput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ProjectApi {
  @GET("project")
  Call<TypeCollection<Project>> list()

  @GET("project")
  Call<TypeCollection<Project>> query(@QueryMap Map<String, String> filters)

  @POST("project")
  Call<Project> create(@Body Project project)
  
  @GET("project/{id}")
  Call<Project> findById(@Path("id") String id)

  @PUT("project/{id}")
  Call<Project> update(@Path("id") String id, @Body Project project)

  @DELETE("project/{id}")
  Call<Project> delete(@Path("id") String id)

  @POST("project/{id}?action=activate")
  Call<Account> activate(@Path("id") String id)

  @POST("project/{id}?action=deactivate")
  Call<Account> deactivate(@Path("id") String id)

  @POST("project/{id}?action=purge")
  Call<Account> purge(@Path("id") String id)

  @POST("project/{id}?action=remove")
  Call<Account> remove(@Path("id") String id)

  @POST("project/{id}?action=setmembers")
  Call<SetProjectMembersInput> setmembers(@Path("id") String id, @Body SetProjectMembersInput setProjectMembersInput)

  @POST("project/{id}?action=upgrade")
  Call<Account> upgrade(@Path("id") String id)
}
