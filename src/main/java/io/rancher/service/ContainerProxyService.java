package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerProxy;

import retrofit2.Call;
import retrofit2.Response;
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
  Call<TypeCollection<ContainerProxy>> list(@QueryMap Filters filters);

  @GET("containerProxy/{id}")
  Call<ContainerProxy> get(@Path("id") String id);

  @POST("containerProxy")
  Call<ContainerProxy> create(@Body ContainerProxy containerProxy);

  @PUT("containerProxy/{id}")
  Call<ContainerProxy> update(@Path("id") String id, @Body ContainerProxy containerProxy);

  @DELETE("containerProxy/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
