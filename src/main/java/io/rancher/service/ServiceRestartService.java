package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceRestart;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceRestartService {

  @GET("serviceRestart")
  Call<TypeCollection<ServiceRestart>> list();

  @GET("serviceRestart")
  Call<TypeCollection<ServiceRestart>> list(@QueryMap HashMap<String,String> filters);

  @GET("serviceRestart/{id}")
  Call<ServiceRestart> get(@Path("id") String id);

  @POST("serviceRestart")
  Call<ServiceRestart> create(@Body ServiceRestart serviceRestart);

  @PUT("serviceRestart/{id}")
  Call<ServiceRestart> update(@Path("id") String id, @Body ServiceRestart serviceRestart);

  @DELETE("serviceRestart/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
