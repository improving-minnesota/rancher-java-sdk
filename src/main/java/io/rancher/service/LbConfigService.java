package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.LbConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LbConfigService {

  @GET("lbConfig")
  Call<TypeCollection<LbConfig>> list();

  @GET("lbConfig")
  Call<TypeCollection<LbConfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("lbConfig/{id}")
  Call<LbConfig> get(@Path("id") String id);

  @POST("lbConfig")
  Call<LbConfig> create(@Body LbConfig lbConfig);

  @PUT("lbConfig/{id}")
  Call<LbConfig> update(@Path("id") String id, @Body LbConfig lbConfig);

  @DELETE("lbConfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
