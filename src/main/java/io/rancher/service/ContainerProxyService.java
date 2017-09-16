package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerProxy;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ContainerProxyService {

  @GET("containerProxy")
  Call<TypeCollection<ContainerProxy>> list();

  @GET("containerProxy")
  Call<TypeCollection<ContainerProxy>> list(@QueryMap HashMap<String,String> filters);

  @GET("containerProxy/{id}")
  Call<ContainerProxy> get(@Path("id") String id);

  @POST("containerProxy")
  Call<ContainerProxy> create(@Body ContainerProxy containerProxy);

  @PUT("containerProxy/{id}")
  Call<ContainerProxy> update(@Path("id") String id, @Body ContainerProxy containerProxy);

  @DELETE("containerProxy/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
