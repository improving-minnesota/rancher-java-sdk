package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServicesPortRange;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServicesPortRangeService {

  @GET("servicesPortRange")
  Call<TypeCollection<ServicesPortRange>> list();

  @GET("servicesPortRange")
  Call<TypeCollection<ServicesPortRange>> list(@QueryMap HashMap<String,String> filters);

  @GET("servicesPortRange/{id}")
  Call<ServicesPortRange> get(@Path("id") String id);

  @POST("servicesPortRange")
  Call<ServicesPortRange> create(@Body ServicesPortRange servicesPortRange);

  @PUT("servicesPortRange/{id}")
  Call<ServicesPortRange> update(@Path("id") String id, @Body ServicesPortRange servicesPortRange);

  @DELETE("servicesPortRange/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
