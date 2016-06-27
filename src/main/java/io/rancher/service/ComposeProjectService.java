package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeProject;
import io.rancher.type.Environment;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ComposeProjectService {

  @GET("composeProject")
  Call<TypeCollection<ComposeProject>> list();

  @GET("composeProject")
  Call<TypeCollection<ComposeProject>> list(@QueryMap Filters filters);

  @GET("composeProject/{id}")
  Call<ComposeProject> get(@Path("id") String id);

  @POST("composeProject")
  Call<ComposeProject> create(@Body ComposeProject composeProject);

  @PUT("composeProject/{id}")
  Call<ComposeProject> update(@Path("id") String id, @Body ComposeProject composeProject);

  @DELETE("composeProject/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("composeProject/{id}?action=cancelrollback")
  Call<Environment> cancelrollback(@Path("id") String id);
  
  @POST("composeProject/{id}?action=cancelupgrade")
  Call<Environment> cancelupgrade(@Path("id") String id);
  
  @POST("composeProject/{id}?action=error")
  Call<Environment> error(@Path("id") String id);
  
  @POST("composeProject/{id}?action=finishupgrade")
  Call<Environment> finishupgrade(@Path("id") String id);
  
  @POST("composeProject/{id}?action=remove")
  Call<Environment> remove(@Path("id") String id);
  
  @POST("composeProject/{id}?action=rollback")
  Call<Environment> rollback(@Path("id") String id);
  
}
