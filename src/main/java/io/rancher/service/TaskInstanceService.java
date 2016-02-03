package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TaskInstance;

import retrofit2.Call;
import retrofit2.Response;
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
  Call<TypeCollection<TaskInstance>> list(@QueryMap Filters filters);

  @GET("taskInstance/{id}")
  Call<TaskInstance> get(@Path("id") String id);

  @POST("taskInstance")
  Call<TaskInstance> create(@Body TaskInstance taskInstance);

  @PUT("taskInstance/{id}")
  Call<TaskInstance> update(@Path("id") String id, @Body TaskInstance taskInstance);

  @DELETE("taskInstance/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
