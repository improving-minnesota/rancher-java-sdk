package io.rancher.service;

import java.util.HashMap;
import io.rancher.base.TypeCollection;
import io.rancher.type.LbTargetConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LbTargetConfigService {

  @GET("lbTargetConfig")
  Call<TypeCollection<LbTargetConfig>> list();

  @GET("lbTargetConfig")
  Call<TypeCollection<LbTargetConfig>> list(@QueryMap HashMap<String,String> filters);

  @GET("lbTargetConfig/{id}")
  Call<LbTargetConfig> get(@Path("id") String id);

  @POST("lbTargetConfig")
  Call<LbTargetConfig> create(@Body LbTargetConfig lbTargetConfig);

  @PUT("lbTargetConfig/{id}")
  Call<LbTargetConfig> update(@Path("id") String id, @Body LbTargetConfig lbTargetConfig);

  @DELETE("lbTargetConfig/{id}")
  Call<Void> delete(@Path("id") String id);
  
}
