package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerEvent;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ContainerEventService {

  @GET("containerEvent")
  Call<TypeCollection<ContainerEvent>> list();

  @GET("containerEvent")
  Call<TypeCollection<ContainerEvent>> list(@QueryMap Filters filters);

  @GET("containerEvent/{id}")
  Call<ContainerEvent> get(@Path("id") String id);

  @POST("containerEvent")
  Call<ContainerEvent> create(@Body ContainerEvent containerEvent);

  @PUT("containerEvent/{id}")
  Call<ContainerEvent> update(@Path("id") String id, @Body ContainerEvent containerEvent);

  @DELETE("containerEvent/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("containerEvent/{id}?action=remove")
  Call<ContainerEvent> remove(@Path("id") String id);
  
}
