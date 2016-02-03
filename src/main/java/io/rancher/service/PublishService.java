package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Publish;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PublishService {

  @GET("publish")
  Call<TypeCollection<Publish>> list();

  @GET("publish")
  Call<TypeCollection<Publish>> list(@QueryMap Filters filters);

  @GET("publish/{id}")
  Call<Publish> get(@Path("id") String id);

  @POST("publish")
  Call<Publish> create(@Body Publish publish);

  @PUT("publish/{id}")
  Call<Publish> update(@Path("id") String id, @Body Publish publish);

  @DELETE("publish/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
