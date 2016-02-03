package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Port;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PortService {

  @GET("port")
  Call<TypeCollection<Port>> list();

  @GET("port")
  Call<TypeCollection<Port>> list(@QueryMap Filters filters);

  @GET("port/{id}")
  Call<Port> get(@Path("id") String id);

  @POST("port")
  Call<Port> create(@Body Port port);

  @PUT("port/{id}")
  Call<Port> update(@Path("id") String id, @Body Port port);

  @DELETE("port/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("port/{id}?action=activate")
  Call<Port> activate(@Path("id") String id);
  
  @POST("port/{id}?action=deactivate")
  Call<Port> deactivate(@Path("id") String id);
  
  @POST("port/{id}?action=purge")
  Call<Port> purge(@Path("id") String id);
  
  @POST("port/{id}?action=remove")
  Call<Port> remove(@Path("id") String id);
  
  @POST("port/{id}?action=restore")
  Call<Port> restore(@Path("id") String id);
  
}
