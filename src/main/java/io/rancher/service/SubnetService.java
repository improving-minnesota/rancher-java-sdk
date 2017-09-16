package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Subnet;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SubnetService {

  @GET("subnet")
  Call<TypeCollection<Subnet>> list();

  @GET("subnet")
  Call<TypeCollection<Subnet>> list(@QueryMap HashMap<String,String> filters);

  @GET("subnet/{id}")
  Call<Subnet> get(@Path("id") String id);

  @POST("subnet")
  Call<Subnet> create(@Body Subnet subnet);

  @PUT("subnet/{id}")
  Call<Subnet> update(@Path("id") String id, @Body Subnet subnet);

  @DELETE("subnet/{id}")
  Call<Void> delete(@Path("id") String id);
  
  @POST("subnet/{id}?action=activate")
  Call<Subnet> activate(@Path("id") String id);
  
  @POST("subnet/{id}?action=deactivate")
  Call<Subnet> deactivate(@Path("id") String id);
  
  @POST("subnet/{id}?action=purge")
  Call<Subnet> purge(@Path("id") String id);
  
  @POST("subnet/{id}?action=remove")
  Call<Subnet> remove(@Path("id") String id);
  
}
