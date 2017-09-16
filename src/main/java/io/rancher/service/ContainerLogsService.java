package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerLogs;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ContainerLogsService {

  @GET("containerLogs")
  Call<TypeCollection<ContainerLogs>> list();

  @GET("containerLogs")
  Call<TypeCollection<ContainerLogs>> list(@QueryMap HashMap<String,String> filters);

  @GET("containerLogs/{id}")
  Call<ContainerLogs> get(@Path("id") String id);

  @POST("containerLogs")
  Call<ContainerLogs> create(@Body ContainerLogs containerLogs);

  @PUT("containerLogs/{id}")
  Call<ContainerLogs> update(@Path("id") String id, @Body ContainerLogs containerLogs);

  @DELETE("containerLogs/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
