package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.TaskInstance;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TaskInstanceService {

  @GET("taskInstance")
  Call<TypeCollection<TaskInstance>> list();

  @GET("taskInstance")
  Call<TypeCollection<TaskInstance>> list(@QueryMap HashMap<String,String> filters);

  @GET("taskInstance/{id}")
  Call<TaskInstance> get(@Path("id") String id);

  @POST("taskInstance")
  Call<TaskInstance> create(@Body TaskInstance taskInstance);

  @PUT("taskInstance/{id}")
  Call<TaskInstance> update(@Path("id") String id, @Body TaskInstance taskInstance);

  @DELETE("taskInstance/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
