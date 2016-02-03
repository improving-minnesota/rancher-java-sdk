package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProcessInstance;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProcessInstanceService {

  @GET("processInstance")
  Call<TypeCollection<ProcessInstance>> list();

  @GET("processInstance")
  Call<TypeCollection<ProcessInstance>> list(@QueryMap Filters filters);

  @GET("processInstance/{id}")
  Call<ProcessInstance> get(@Path("id") String id);

  @POST("processInstance")
  Call<ProcessInstance> create(@Body ProcessInstance processInstance);

  @PUT("processInstance/{id}")
  Call<ProcessInstance> update(@Path("id") String id, @Body ProcessInstance processInstance);

  @DELETE("processInstance/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
