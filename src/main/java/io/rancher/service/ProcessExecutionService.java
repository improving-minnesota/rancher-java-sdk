package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProcessExecution;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ProcessExecutionService {

  @GET("processExecution")
  Call<TypeCollection<ProcessExecution>> list();

  @GET("processExecution")
  Call<TypeCollection<ProcessExecution>> list(@QueryMap Filters<String, String> filters);

  @GET("processExecution/{id}")
  Call<ProcessExecution> get(@Path("id") String id);

  @POST("processExecution")
  Call<ProcessExecution> create(@Body ProcessExecution processExecution);

  @PUT("processExecution/{id}")
  Call<ProcessExecution> update(@Path("id") String id, @Body ProcessExecution processExecution);

  @DELETE("processExecution/{id}")
  Call<Response> delete(@Path("id") String id);
  

  
}
