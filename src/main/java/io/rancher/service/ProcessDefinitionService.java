package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProcessDefinition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProcessDefinitionService {

  @GET("processDefinition")
  Call<TypeCollection<ProcessDefinition>> list();

  @GET("processDefinition")
  Call<TypeCollection<ProcessDefinition>> list(@QueryMap Filters filters);

  @GET("processDefinition/{id}")
  Call<ProcessDefinition> get(@Path("id") String id);

  @POST("processDefinition")
  Call<ProcessDefinition> create(@Body ProcessDefinition processDefinition);

  @PUT("processDefinition/{id}")
  Call<ProcessDefinition> update(@Path("id") String id, @Body ProcessDefinition processDefinition);

  @DELETE("processDefinition/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
