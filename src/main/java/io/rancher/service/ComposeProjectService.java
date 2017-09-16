package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeProject;
import io.rancher.type.Stack;

import retrofit2.Call;
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
  Call<TypeCollection<ComposeProject>> list(@QueryMap HashMap<String,String> filters);

  @GET("composeProject/{id}")
  Call<ComposeProject> get(@Path("id") String id);

  @POST("composeProject")
  Call<ComposeProject> create(@Body ComposeProject composeProject);

  @PUT("composeProject/{id}")
  Call<ComposeProject> update(@Path("id") String id, @Body ComposeProject composeProject);

  @DELETE("composeProject/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("composeProject/{id}?action=cancelupgrade")
  Call<Stack> cancelupgrade(@Path("id") String id);
  
  @POST("composeProject/{id}?action=error")
  Call<Stack> error(@Path("id") String id);
  
  @POST("composeProject/{id}?action=finishupgrade")
  Call<Stack> finishupgrade(@Path("id") String id);
  
  @POST("composeProject/{id}?action=remove")
  Call<Stack> remove(@Path("id") String id);
  
  @POST("composeProject/{id}?action=rollback")
  Call<Stack> rollback(@Path("id") String id);
  
}
