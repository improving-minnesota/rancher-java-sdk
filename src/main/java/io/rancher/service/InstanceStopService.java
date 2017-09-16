package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.InstanceStop;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface InstanceStopService {

  @GET("instanceStop")
  Call<TypeCollection<InstanceStop>> list();

  @GET("instanceStop")
  Call<TypeCollection<InstanceStop>> list(@QueryMap HashMap<String,String> filters);

  @GET("instanceStop/{id}")
  Call<InstanceStop> get(@Path("id") String id);

  @POST("instanceStop")
  Call<InstanceStop> create(@Body InstanceStop instanceStop);

  @PUT("instanceStop/{id}")
  Call<InstanceStop> update(@Path("id") String id, @Body InstanceStop instanceStop);

  @DELETE("instanceStop/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
