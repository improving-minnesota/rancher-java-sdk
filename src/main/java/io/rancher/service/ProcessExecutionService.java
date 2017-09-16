package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProcessExecution;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProcessExecutionService {

  @GET("processExecution")
  Call<TypeCollection<ProcessExecution>> list();

  @GET("processExecution")
  Call<TypeCollection<ProcessExecution>> list(@QueryMap HashMap<String,String> filters);

  @GET("processExecution/{id}")
  Call<ProcessExecution> get(@Path("id") String id);

  @POST("processExecution")
  Call<ProcessExecution> create(@Body ProcessExecution processExecution);

  @PUT("processExecution/{id}")
  Call<ProcessExecution> update(@Path("id") String id, @Body ProcessExecution processExecution);

  @DELETE("processExecution/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
