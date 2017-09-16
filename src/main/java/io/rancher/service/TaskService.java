package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Task;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TaskService {

  @GET("task")
  Call<TypeCollection<Task>> list();

  @GET("task")
  Call<TypeCollection<Task>> list(@QueryMap HashMap<String,String> filters);

  @GET("task/{id}")
  Call<Task> get(@Path("id") String id);

  @POST("task")
  Call<Task> create(@Body Task task);

  @PUT("task/{id}")
  Call<Task> update(@Path("id") String id, @Body Task task);

  @DELETE("task/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("task/{id}?action=execute")
  Call<Task> execute(@Path("id") String id);
  
}
