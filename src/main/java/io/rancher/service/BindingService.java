package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.Binding;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BindingService {

  @GET("binding")
  Call<TypeCollection<Binding>> list();

  @GET("binding")
  Call<TypeCollection<Binding>> list(@QueryMap HashMap<String,String> filters);

  @GET("binding/{id}")
  Call<Binding> get(@Path("id") String id);

  @POST("binding")
  Call<Binding> create(@Body Binding binding);

  @PUT("binding/{id}")
  Call<Binding> update(@Path("id") String id, @Body Binding binding);

  @DELETE("binding/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
