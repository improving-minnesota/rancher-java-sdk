package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Project;
import io.rancher.type.SetProjectMembersInput;
import io.rancher.type.Account;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectService {

  @GET("project")
  Call<TypeCollection<Project>> list();

  @GET("project")
  Call<TypeCollection<Project>> list(@QueryMap Filters filters);

  @GET("project/{id}")
  Call<Project> get(@Path("id") String id);

  @POST("project")
  Call<Project> create(@Body Project project);

  @PUT("project/{id}")
  Call<Project> update(@Path("id") String id, @Body Project project);

  @DELETE("project/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("project/{id}?action=activate")
  Call<Account> activate(@Path("id") String id);
  
  @POST("project/{id}?action=deactivate")
  Call<Account> deactivate(@Path("id") String id);
  
  @POST("project/{id}?action=purge")
  Call<Account> purge(@Path("id") String id);
  
  @POST("project/{id}?action=remove")
  Call<Account> remove(@Path("id") String id);
  
  @POST("project/{id}?action=restore")
  Call<Account> restore(@Path("id") String id);
  
  @POST("project/{id}?action=setmembers")
  Call<SetProjectMembersInput> setmembers(@Path("id") String id, @Body SetProjectMembersInput setProjectMembersInput);
  
}
