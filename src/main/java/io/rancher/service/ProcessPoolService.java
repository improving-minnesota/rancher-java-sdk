package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProcessPool;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProcessPoolService {

  @GET("processPool")
  Call<TypeCollection<ProcessPool>> list();

  @GET("processPool")
  Call<TypeCollection<ProcessPool>> list(@QueryMap Filters filters);

  @GET("processPool/{id}")
  Call<ProcessPool> get(@Path("id") String id);

  @POST("processPool")
  Call<ProcessPool> create(@Body ProcessPool processPool);

  @PUT("processPool/{id}")
  Call<ProcessPool> update(@Path("id") String id, @Body ProcessPool processPool);

  @DELETE("processPool/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
