package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.PortRule;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PortRuleService {

  @GET("portRule")
  Call<TypeCollection<PortRule>> list();

  @GET("portRule")
  Call<TypeCollection<PortRule>> list(@QueryMap HashMap<String,String> filters);

  @GET("portRule/{id}")
  Call<PortRule> get(@Path("id") String id);

  @POST("portRule")
  Call<PortRule> create(@Body PortRule portRule);

  @PUT("portRule/{id}")
  Call<PortRule> update(@Path("id") String id, @Body PortRule portRule);

  @DELETE("portRule/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
