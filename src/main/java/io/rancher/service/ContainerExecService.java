package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerExec;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ContainerExecService {

  @GET("containerExec")
  Call<TypeCollection<ContainerExec>> list();

  @GET("containerExec")
  Call<TypeCollection<ContainerExec>> list(@QueryMap HashMap<String,String> filters);

  @GET("containerExec/{id}")
  Call<ContainerExec> get(@Path("id") String id);

  @POST("containerExec")
  Call<ContainerExec> create(@Body ContainerExec containerExec);

  @PUT("containerExec/{id}")
  Call<ContainerExec> update(@Path("id") String id, @Body ContainerExec containerExec);

  @DELETE("containerExec/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
