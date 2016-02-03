package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectMember;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectMemberService {

  @GET("projectMember")
  Call<TypeCollection<ProjectMember>> list();

  @GET("projectMember")
  Call<TypeCollection<ProjectMember>> list(@QueryMap Filters filters);

  @GET("projectMember/{id}")
  Call<ProjectMember> get(@Path("id") String id);

  @POST("projectMember")
  Call<ProjectMember> create(@Body ProjectMember projectMember);

  @PUT("projectMember/{id}")
  Call<ProjectMember> update(@Path("id") String id, @Body ProjectMember projectMember);

  @DELETE("projectMember/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("projectMember/{id}?action=activate")
  Call<ProjectMember> activate(@Path("id") String id);
  
  @POST("projectMember/{id}?action=deactivate")
  Call<ProjectMember> deactivate(@Path("id") String id);
  
  @POST("projectMember/{id}?action=purge")
  Call<ProjectMember> purge(@Path("id") String id);
  
  @POST("projectMember/{id}?action=remove")
  Call<ProjectMember> remove(@Path("id") String id);
  
  @POST("projectMember/{id}?action=restore")
  Call<ProjectMember> restore(@Path("id") String id);
  
}
