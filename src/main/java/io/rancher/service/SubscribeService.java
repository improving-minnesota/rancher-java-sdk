package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Subscribe;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SubscribeService {

  @GET("subscribe")
  Call<TypeCollection<Subscribe>> list();

  @GET("subscribe")
  Call<TypeCollection<Subscribe>> list(@QueryMap Filters filters);

  @GET("subscribe/{id}")
  Call<Subscribe> get(@Path("id") String id);

  @POST("subscribe")
  Call<Subscribe> create(@Body Subscribe subscribe);

  @PUT("subscribe/{id}")
  Call<Subscribe> update(@Path("id") String id, @Body Subscribe subscribe);

  @DELETE("subscribe/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
